package StringsSecondAssignments.week1;

public class Part2 {
	
	
	public static void main(String args[]) {
		
		//System.out.println(findSimpleGene ("ATGGGTTAAGTC" , "ATG", "TAA"));
		//System.out.println(findSimpleGene ("ATGGGTAFBBCDDEFGDOHTMMNTAAGTAAGTC" , "ATG", "TAA"));
		testFindStop();
		testFindGene() ;
		testAllGenes();
	}
	public static String findSimpleGene (String dna, String startCond, String endCond) {
		int startIndex = dna.indexOf(startCond);
		int curIndex = dna.indexOf(endCond, startIndex + 3);
		
		while(curIndex != -1) {
			
			//If current Index multiply of 3
			if((startIndex - curIndex) % 3 == 0 ) {
				return dna.substring(startIndex, curIndex + 3);
			} else {
				curIndex = dna.indexOf(endCond, curIndex + 1);;
			}
			
		}
				
		return "";
	}
	public static int findStopCodon(String dnaStr, int startIndex, String stopCodon) {
		int curIndex = dnaStr.indexOf(stopCodon, startIndex + 3);
		while(curIndex != -1) {
			int diff = curIndex - startIndex;
			if (diff % 3 == 0) {
				return curIndex;
			} else {
				curIndex = dnaStr.indexOf(stopCodon, curIndex + 1);
			}
		}
		return -1;
	}
	
	public static void testFindStop() {
		String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
		int dex = findStopCodon(dna,0,"TAA");
		if (dex != 9 ) System.out.println("error on 9");
		dex = findStopCodon(dna,9,"TAA");
		if(dex != 21) System.out.println("error on 21");
		dex = findStopCodon(dna,1,"TAA");
		if(dex != -1) System.out.println("error on 26 TAG");
		dex = findStopCodon(dna,0,"TAG");
		if (dex != -1) System.out.println("error on 26 TAG");
		System.out.println("tests finished");
	}
	public static String findGene(String dna, int where) {
		int startIndex = dna.indexOf("ATG", where);
		if(startIndex == -1) {
			return "";
		}
		int taaIndex = findStopCodon(dna,startIndex,"TAA");
		int tagIndex = findStopCodon(dna, startIndex, "TAG");
		int tgaIndex = findStopCodon(dna, startIndex, "TGA");
		//int temp= Math.min(taaIndex, tagIndex);
		int minIndex = 0;
		if (taaIndex == -1 || 
				( tgaIndex != -1 && tgaIndex < taaIndex )) {
			minIndex = tgaIndex;
		} else {
			minIndex = taaIndex;
		}
		if (minIndex == -1 || 
				(tagIndex != -1 && tagIndex < minIndex)) {
			minIndex = tagIndex;
		}
		//int minIndex = Math.min(temp, tgaIndex);
		/*if (minIndex  == dna.length()) {
			return "";
		}*/
		if (minIndex == -1 ) {
			return "";
		}
		
		return dna.substring(startIndex, minIndex + 3); 
	}
	
	
	
	public static String findGene(String dna) {
		int startIndex = dna.indexOf("ATG");
		if(startIndex == -1) {
			return "";
		}
		int taaIndex = findStopCodon(dna,startIndex,"TAA");
		int tagIndex = findStopCodon(dna, startIndex, "TAG");
		int tgaIndex = findStopCodon(dna, startIndex, "TGA");
		//int temp= Math.min(taaIndex, tagIndex);
		int minIndex = 0;
		if (taaIndex == -1 || 
				( tgaIndex != -1 && tgaIndex < taaIndex )) {
			minIndex = tgaIndex;
		} else {
			minIndex = taaIndex;
		}
		if (minIndex == -1 || 
				(tagIndex != -1 && tagIndex < minIndex)) {
			minIndex = tagIndex;
		}
		//int minIndex = Math.min(temp, tgaIndex);
		/*if (minIndex  == dna.length()) {
			return "";
		}*/
		if (minIndex == -1 ) {
			return "";
		}
		
		return dna.substring(startIndex, minIndex + 3); 
	}
	public static void testFindGene() {
		String dnaSrc = "ATGxxxyyyzzzTAAxxxyyyzzzTAAxxxTGAyyyTAG";
		String gene = findGene(dnaSrc);
		//System.out.println(gene);
		if (!gene.equals("ATGxxxyyyzzzTAA")) {
			System.out.println("error");
		}
		
	}
	public static void printAllGenes(String dna) {
			int startIndex = 0;
			
			while( true ) {
				String currentGene = findGene(dna, startIndex);
				
				if(currentGene.isEmpty()) {
					break;
				}
				System.out.println(currentGene);
				startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
			
			}
		
	}
	public static void testAllGenes() {
		String dna = "ATGATCTAATTTATGCEGCAACGGTGAAGV";
		printAllGenes(dna);
	}
	

}
