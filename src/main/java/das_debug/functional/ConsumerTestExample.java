package das_debug.functional;

import java.util.HashMap;
import java.util.Map;

public class ConsumerTestExample {
    public static void main(String args[]){
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = (String s)->System.out.println(s);

        c1.accept("Anna");
        c2.accept("Jhon");


        Map<String,Integer> map = new HashMap<>();
        BiConsumer <String,Integer> b1 = map::put;
        BiConsumer<String,Integer> b2 = (k,v)-> map.put(k,v);


        b1.accept("chicken", 7);
        b2.accept("chick", 5);

        System.out.println(map);
    }
}
