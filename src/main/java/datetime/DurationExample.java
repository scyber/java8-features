package datetime;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String args[]) {
        Duration daily = Duration.ofDays(1); // PT24H
        System.out.println(daily);
        Duration hourly = Duration.ofHours(1); // PT1H
        System.out.println(hourly);
        Duration everyMinute = Duration.ofMinutes(1); // PT1M
        System.out.println(everyMinute);
        Duration everyTenSeconds = Duration.ofSeconds(10); // PT10S
        System.out.println(everyTenSeconds);
        Duration everyMilli = Duration.ofMillis(1); // PT0.001S
        System.out.println(everyMilli);
        Duration everyNano = Duration.ofNanos(1); //
        System.out.println(everyNano);

        // Another example
        daily = Duration.of(1, ChronoUnit.DAYS);
        System.out.println(daily);
        hourly = Duration.of(1, ChronoUnit.HOURS);
        Duration halfDay = Duration.of(12,ChronoUnit.HOURS);
        System.out.println(halfDay);
        everyMinute = Duration.of(1, ChronoUnit.MINUTES);
        everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        everyNano = Duration.of(1, ChronoUnit.NANOS);
    }
}
