package week3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class WhichCountryExports {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//readFileCSV("exports_small.csv");
		String pathToFile = "/opt/download/exports/exports_small.csv";
		
		CSVParser p = getParcer (pathToFile);
		String country = "Germany";
		String r = countryinfo(p, country);
		System.out.println(r);
		p = getParcer (pathToFile);
		String item1 = "gold";
		String item2 = "diamonds";
		listExportersTwoProducts(p, item1, item2);
		p = getParcer (pathToFile);
		System.out.println("Number exportes of Gold " + numberOfExporters(p,item1));

	}
	public static void readFileCSV(String fileName) throws IOException {
		Path p = Paths.get("/opt/download/exports/" + fileName);
		InputStream in = Files.newInputStream(p);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
	}
	public static CSVParser getParcer (String file) throws IOException {
		File csvData = new File(file);
		CSVParser parcer = CSVParser.parse(csvData,Charset.forName("UTF8") ,CSVFormat.DEFAULT);
		return parcer;
	}
	public static String countryinfo (CSVParser parcer, String country) {
		
		String result = "NOT FOUND ";
		CSVRecord record = null;
		
		for(CSVRecord rec: parcer) {
			if(rec.get(0).toString().equals(country)) {
				//System.out.println(rec);
				result = rec.get(0).toString() + " : " + rec.get(1).toString() + ": " + rec.get(2).toString() ;
				record = rec;
			}
			
		}
		
		return result;
	}
	public static void listExportersTwoProducts(CSVParser parser, String item1, String item2) {
		ArrayList<String> twoProductsCountry = new ArrayList<>();
		for(CSVRecord rec: parser) {
			String items = rec.get(1).toString();
			if(items.contains(item1) & items.contains(item2)) {
					//System.out.println(rec.get(0));
					twoProductsCountry.add(rec.get(0).toString());
				}
			}
		
		for(String country: twoProductsCountry ) {
			System.out.println(country);
		}	
	}
	public static int numberOfExporters(CSVParser parser, String item) {
		int counter = 0;
		for (CSVRecord r: parser) {
			if(r.get(1).toString().contains(item)) {
				counter++;
			}
		}
		
		
		return counter;
	}

}
