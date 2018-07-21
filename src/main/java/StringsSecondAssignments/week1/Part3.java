package StringsSecondAssignments.week1;

public class Part3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testTwoOccur();
		testLastPart();
		
		

	}
	public static boolean twoOccurrences(String a, String b) {
		
		int counter = 0;
		
		while (b.contains(a) != false) {
			
			int startIndex = b.indexOf(a);
			b = b.substring(startIndex + a.length());
			//System.out.println(" b " + b );
			counter++;
			//System.out.println(counter);
		}
		if (counter > 1) {
			return true;
		} else {
			return false;
		}
		
	}
	public static String lastPart(String a, String b){
		if(b.contains(a)) {
			return b.substring(b.indexOf(a) + a.length());
		} else {
			return b;
		}
		
	}
	public static void testTwoOccur() {
		System.out.println(twoOccurrences("an", "banana"));
	}
	public static void testLastPart() {
		System.out.println(lastPart("an", "banana"));
		System.out.println(lastPart("zoo", "forest")); 
	}
	

}
