package StringsSecondAssignments.week2;

import java.util.HashMap;
import java.util.Map;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testHowMany() ;

	}
	public static int howMany(String a, String b) {
		String tmpA = a;
		String tmpB = b;
		int counter = 0;
		int tmpAIndex = 0;
		Map <String,Integer> res = new HashMap<>();
		while(tmpB.contains(tmpA)) {	
				counter++;
				tmpAIndex = tmpB.indexOf(tmpA) + tmpA.length();
				tmpB = tmpB.substring(tmpB.indexOf(tmpA) +  tmpA.length());
				/*System.out.println(counter);
				System.out.println(tmpAIndex);
				System.out.println(tmpB);*/
			
		}
		return counter;
	}
	public static void testHowMany() {
		System.out.print("Should print 4 " );
		System.out.println(howMany("AA","AABBCCAADDAABBCCAA"));
		System.out.print("Should print 0 ");
		System.out.println(howMany("AA", "BBCCDDEEFF"));
	}

}
