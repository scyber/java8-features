package das_debug.functional;

import java.time.LocalDate;
import java.util.ArrayList;

public class SupplyTestExample {
    public static void main(String args[]) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = ()-> LocalDate.now().minusYears(10);

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        Supplier<ArrayList<String>> s3 = ArrayList::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(a1);


    }
}
