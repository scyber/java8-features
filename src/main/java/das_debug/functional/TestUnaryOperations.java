package das_debug.functional;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class TestUnaryOperations {
    public static void main(String args[]){
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x->x.toUpperCase();


        System.out.println(u1.apply("chrirp"));
        System.out.println(u2.apply("chrirp"));


        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string,toAdd)->string.concat(toAdd);

        System.out.println(b1.apply("baby", "chick"));
        System.out.println(b2.apply("baby", "chick"));


    }
}
