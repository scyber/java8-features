package das_debug.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers {
    public static void main(String args[]) {
        int attendeeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeeesPerYear / 12;

        NumberFormat us = NumberFormat.getInstance(Locale.US);
        NumberFormat ger = NumberFormat.getInstance(Locale.GERMANY);
        NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);

        System.out.println(us.format(attendeesPerMonth));
        System.out.println(ger.format(attendeesPerMonth));
        System.out.println(ca.format(attendeesPerMonth));

    }
}
