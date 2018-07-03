package das_debug.functional;

public class TestFunctionExample {
    public static void main(String args[]){

        Function<String,Integer> f1 = String::length;
        Function<String,Integer> f2 = x->x.length();

        System.out.println(f1.appy("cluck"));
        System.out.println(f2.appy("cluck"));


        BiFunction<String,String,String> b1 = String::concat;
        BiFunction<String,String,String> b2 = (string,toAdd)->string.concat(toAdd);


        System.out.println(b1.appy("baby","chick"));
        System.out.println(b2.appy("baby", "chick"));

    }
}
