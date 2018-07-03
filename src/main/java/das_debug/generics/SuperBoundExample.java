package das_debug.generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SuperBoundExample {

    public static void main(String args[]){
        List<? super IOException> exceptions = new ArrayList<Object>();
        //Does not complie
        //exceptions.add(new Exception());
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());

        Boolean b = new Boolean("/true");
        System.out.println(b);
    }
    public static double sqr(double arg) {
        throw new RuntimeException();
    }
    public static double sqr(double arg, double arg1) {
        while (true);
    }
}
