package datetime;

import java.time.*;

public class DateTimeExample {
	public static void main(String args[]) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());

		ZoneId zone = ZoneId.of("US/Eastern");
		System.out.println(zone);
		ZonedDateTime zonedDateTime = ZonedDateTime.of(2018, 1,20, 6,15, 20,200,zone);
		System.out.println(zonedDateTime);


		LocalDate localDate = LocalDate.now();
		long l = localDate.toEpochDay();
		System.out.println(l);


	}

}
