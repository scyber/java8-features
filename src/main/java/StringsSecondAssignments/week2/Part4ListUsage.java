package StringsSecondAssignments.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Part4ListUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testGeneGetter();
		//testCGRatio();
		//testCountCTG();
		testProcessGenes();
	}
	public static String findGene(String dna ) {
        /*
        Find the index of the first occurrence of the start codon “ATG”. If there is no “ATG”, return the empty string.
        Find the index of the first occurrence of the stop codon “TAA” after the first occurrence of “ATG” that is a multiple of three away from the “ATG”. Hint: call findStopCodon.
        Find the index of the first occurrence of the stop codon “TAG” after the first occurrence of “ATG” that is a multiple of three away from the “ATG”. Find the index of the first occurrence of the stop codon “TGA” after the first occurrence of “ATG” that is a multiple of three away from the “ATG”.
        Return the gene formed from the “ATG” and the closest stop codon that is a multiple of three away. If there is no valid stop codon and therefore no gene, return the empty string.
         */
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1 ) {
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int atgIndex = findStopCodon(dna, startIndex, "TAG");
        int temp = Math.min(taaIndex, tagIndex);
        int minIndex = Math.min(temp,atgIndex);
        if (minIndex == startIndex) {
            return "";
        }
        return dna.substring(startIndex,minIndex + 3);

    }
	public static int findStopCodon (String dna, int startIndex, String stopCodon ) {
        int curIndex = dna.indexOf(stopCodon, startIndex + 3);

        while (curIndex != -1 ) {
            int diff = startIndex - curIndex;
                if(curIndex % 3 == 0 ) {
                    return curIndex;
                } else {
                   curIndex = dna.indexOf(stopCodon, curIndex +1);
                }
        }
            return dna.length();
    }
	public static ArrayList<String> getGenes(String dna) {
		int counter = 0;
		String tmpDna = dna;
    	int indexDna = 0;
    	ArrayList<String> genes = new ArrayList<>();
    	
    	while(true) {
    		//FindGene
    		String gene = findGene(tmpDna);
    		//System.out.println("gene");
    		//System.out.println(gene);
    		genes.add(gene);
    		
    		if ( gene.equals("")) {
    			break;
    		} else {
    			counter++;
    			indexDna = tmpDna.indexOf(gene)+ gene.length();    			
    			tmpDna = tmpDna.substring(indexDna);
    		}
    		
    		
    	}

		return genes;
	}
	public static void testGeneGetter() {
		//System.out.println("should print 2 ");
		//System.out.println(countGenes("ATGBCDTAABBBATGAAABBBCCCTAGCCCDDDEEE"));
		ArrayList <String> genes = getGenes("ATGBCDTAABBBATGAAABBBCCCTAGCCCDDDEEE");
		System.out.println("should print 2 genes");
		for(String s: genes) {
			System.out.println(s);
		}
		System.out.println("should print 3 ");
		genes = getGenes("ATGAAABBBTAAATGAAABBBCCCTAAATGAAABBBCCCDDDEEETAA");
		for(String s: genes) {
			System.out.println(s);
		}
		//System.out.println(countGenes("ATGAAABBBTAAATGAAABBBCCCTAAATGAAABBBCCCDDDEEETAA"));
		
	}
	public static double cGRatio(String dna) {
		String tmpDNA = dna;
		char [] arr = dna.toCharArray();
		double numerator = 0;

		for(int i = 0; i <= arr.length -1; i++) {
			if( arr[i] == 'C' | arr[i] == 'G')
				numerator ++;	
		}
		
		return numerator/dna.length();
	}
	public static void testCGRatio() {
		System.out.println(cGRatio("ATGCCATAG"));
	}
	public static void testCountCTG() {
		String dna = "ATGCTGBCDCTGTAG";
		System.out.println(countCTG(dna) == 2);
	}
	public static int countCTG(String dna) {
		String tmpDNA = dna;
		String ctg = "CTG";
		int counter = 0;
		while(tmpDNA.contains(ctg) & tmpDNA.length() != -1) {
			if(tmpDNA.contains(ctg)) {
				counter++;
				tmpDNA = tmpDNA.substring(tmpDNA.indexOf(ctg) + 3);
				
			}
		}
		
		return counter;
	}
	public static void processGenes (ArrayList<String> sr) {
		/*
		 *  
		 *  print all the Strings in sr that are longer than 9 characters
		 *  
			print the number of Strings in sr that are longer than 9 characters
			
			print the Strings in sr whose C-G-ratio is higher than 0.35
			
			print the number of strings in sr whose C-G-ratio is higher than 0.35
			print the length of the longest gene in sr
		 * 
		 * 
		 */
		List<String> list = sr;
		
		Stream<String> st = list.stream();
		
		//ToDo first Condtion
		st.filter(s->s.length() > 9).forEach(System.out::println);
		
		//ToDo second Condition
		int counter = 0;
		
		for(String s : sr) {
			if(s.length() > 9)
				counter++;
		}
		System.out.println("Num of String longer than 9 chars " + counter);
		
		//ToDo third condition
		List<String> list2 = sr;
		st = list2.stream();
		st.filter(s-> cGRatio(s) > 0.35 ).forEach(System.out::println);
		
		//ToDo 4 Conditions 
		int cCounter = 0;
		for (String s : sr) {
			if(cGRatio(s) > 0.35)
				cCounter++;
		}
		System.out.println("Number of String with GTRation over 0.35 " + cCounter);
		
		String max = "";
		for(String s: sr) {
			if(s.length() > max.length())
				max = s;
		}
		System.out.println("Longes String " + max);
		
		
	}
	public static void testProcessGenes() {
		ArrayList <String> genes = getGenes("ATGBCDTAABBBATGAAABBBCCCTAGCCCDDDEEEATGCCCFFFDDDTAGATGDDDFFFEEEGGGTAG");
		//System.out.println(genes);
		//ArrayList <String> genes = Part1.getGenes("ATGBCDTAABBBATGAAABBBCCCTAGCCCDDDEEE");
		
		processGenes(genes);
		genes = getGenes("ATGCCATAG");
		processGenes(genes);
		
	}

}
