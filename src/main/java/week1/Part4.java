package week1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;



public class Part4 {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		System.out.println(geYouTubeURL());
		
		
	}
	public static String geYouTubeURL() throws IOException {
		String path = "http://www.dukelearntoprogram.com/course2/data/manylinks.html";
		URL url = new URL(path);
		
		InputStreamReader is = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(is);
		String result = "";
		StringBuilder sb = new StringBuilder();
		while((result = br.readLine()) != null) {
			//ToDo call method to Filter and Add to YoutubeList
			if(result.toLowerCase().contains("youtube")) {
				result = parseYouTubeURL(result);
				//System.out.println(result);
				sb.append(result);
				sb.append("\n");
			}
			//sb.append(result);
			//sb.append("\n");
		}
		br.close();
		return sb.toString();
	}
	public static String parseYouTubeURL (String a) {
		String startIndex =  "";
		String endIndex = "\"";
		if (a.contains("https")) {
			 startIndex = "https://";
		} else {
			startIndex = "http://";
		}
		String result = a.substring(a.indexOf(startIndex) + startIndex.length(), a.lastIndexOf(endIndex));
		return result;
	}
	

}
