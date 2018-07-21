package StringsSecondAssignments.week2;

public class Part1 {
    /*
    Find the index of the first occurrence of the start codon “ATG”. If there is no “ATG”, return the empty string.
    This assignment is to write the code from the lesson to make the following improvements to your algorithm:
    A. Find a gene in a strand of DNA where the stop codon could be any of the three stop codons “TAA”, “TAG”, or “TGA”.

     */

    public static void main(String args[]){
        String stopTAA = "TAA";
        String stopTAG = "TAG";
        String stopTGA = "TGA";
        String startATG = "ATG";
        testDNA();



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
    public static void printAllGenes (String dna){
    	

    }
    public static void testDNA(){
        String demoDNA = "ATGBDCTAABCDNFGTAGHFN";
        System.out.println("dna length " + demoDNA.length());
        int startIndex = demoDNA.indexOf("ATG");

        System.out.println(findStopCodon(demoDNA, 0, "TAA"));
        System.out.println(findStopCodon(demoDNA, 0, "TAG"));

        System.out.println(findGene(demoDNA));

        demoDNA = "BDFATGCDFGDETAG";
        System.out.println(findGene(demoDNA));
    }

}
