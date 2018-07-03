package das_debug.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class TestMapApiFunnction {
    public static void main(String args[]){
        Map<String,Integer> counts = new HashMap<>();
        Function<String,Integer> mapper = (k)-> 1;
        //counts.put("Tom", 2);
        counts.put("Jenny", 3);
        counts.put("Sam", 8);
        System.out.println(counts);
        counts.computeIfAbsent("Tom", mapper);
        System.out.println(counts);
        counts.computeIfPresent("Jenny", (k,v)-> null);
        counts.computeIfAbsent("Jhon", k->null);
        System.out.println(counts);
    }
}
