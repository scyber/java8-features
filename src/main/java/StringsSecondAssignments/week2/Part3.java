package StringsSecondAssignments.week2;

import java.util.ArrayList;
import java.util.List;

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGeneCounter();
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
	public static int countGenes(String dna) {

		return getGenes(dna).size();
	}
	public static List<String> getGenes(String dna){
        int counter = 0;
        String tmpDna = dna;
        int indexDna = 0;
        List<String> genes = new ArrayList<>();
        while(true) {
            //FindGene
            String gene = findGene(tmpDna);
            //System.out.println("gene");
            //System.out.println(gene);


            if ( gene.equals("")) {
                break;
            } else {
                //counter++;
                genes.add(gene);
                indexDna = tmpDna.indexOf(gene)+ gene.length();
                tmpDna = tmpDna.substring(indexDna);
            }


        }

        return genes;
    }
	public static double cgRatio (String dna){
		//Count Cs and Gs and divide by Gene lenght
        String gene = findGene(dna);
        int gCounter = Part2.howMany("G", gene) ;
        int cCounter = Part2.howMany("C", gene);

        return (gCounter + cCounter)/gene.length();

	}
	public static void testGeneCounter() {
		System.out.print("should print 2 ");
		System.out.println(countGenes("ATGBCDTAABBBATGAAABBBCCCTAGCCCDDDEEE"));
		System.out.print("should print 3 ");
		System.out.println(countGenes("ATGAAABBBTAAATGAAABBBCCCTAAATGAAABBBCCCDDDEEETAA"));
		
	}

}
