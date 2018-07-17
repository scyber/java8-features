package datetime;

import java.time.Duration;

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

    }
}
