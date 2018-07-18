package das_debug.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {
    public static void main(String args[]){
        System.out.println(NumberFormat.getInstance().format(222.34));
        System.out.println(NumberFormat.getInstance(Locale.US).format(222.34));

        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(2200));
        System.out.println(NumberFormat.getCurrencyInstance().format(2200));



    }
}
