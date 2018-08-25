package datetime;

import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.Stream;

public class LocaleExample {
    public static void main(String args[]) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(Locale.GERMANY);
        System.out.println(new Locale("hi", "IN"));

        Locale l1 = new Locale.Builder()
                .setLanguage("de")
                .setRegion("US")
                .build();
        System.out.println(l1);
        ArrayList<String> l = new ArrayList<>();
        //print locales
        System.out.println("Print available locales ");
        Stream<Locale> lan = Stream.of(Locale.getAvailableLocales());
        lan.filter(s->s.toString().contains("US")).forEach(System.out::println);

    }
}
