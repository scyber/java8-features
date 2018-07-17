package datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class InstantExample {
    public static void main(String args[]) throws InterruptedException {
        Instant now = Instant.now();
        System.out.println(Math.random());
        Thread.sleep((long) (Math.random() * 1000));
        Instant later = Instant.now();

        Duration duration = Duration.between(now,later);
        System.out.println(duration.toMillis());

        Instant instant = Instant.ofEpochSecond(LocalDateTime.now().getSecond());
        System.out.println(instant);


    }
}
