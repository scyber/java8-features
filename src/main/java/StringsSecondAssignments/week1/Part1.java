package StringsSecondAssignments.week1;

public class Part1 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		testSimpleGene();
		
	}
	
	public static String findSimpleGene (String dna) {
		String start = "ATG";
		String end = "TAA";
		String result = "";
		
		if(((dna.indexOf(start) | dna.indexOf(end)) != -1) && (dna.indexOf(start)< dna.indexOf(end)) && ((dna.substring(dna.indexOf(start), dna.indexOf(end))).length()%3 ==0)) {
			result = dna.substring(dna.indexOf(start), dna.indexOf(end) + 3 );
		}
		return result;
	}
	
	public static void testSimpleGene() {
		String noATG = "AFFZCFTAA";
		String noTAA = "ATGXFZFDX";
		String noCorLength = "ATGFXZQKDDZTAA";
		String dna = "ATGFXZFQZIDZTAA";
		
		System.out.println(findSimpleGene(noATG));
		System.out.println(findSimpleGene(noTAA));
		System.out.println(findSimpleGene(noCorLength));
		System.out.println(findSimpleGene(dna));
		
	}

}
