package das_debug.enums;

public enum Season3 {
	WINTER {
		public void printHours() { System.out.println("short hours"); }
		}, SUMMER {
		public void printHours() { System.out.println("long hours"); }
		}, SPRING, FALL;
		public void printHours() { System.out.println("default hours"); }
}
