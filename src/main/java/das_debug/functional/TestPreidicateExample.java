package das_debug.functional;

public class TestPreidicateExample {
    public static void main(String args[]){
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x->x.isEmpty();


        System.out.println(p1.test(""));
        System.out.println(p2.test(" "));


        BiPredicate<String,String> b1 = String::startsWith;
        BiPredicate<String,String> b2 = (x,z)->x.startsWith(z);

        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicket", "chuck"));



    }
}
