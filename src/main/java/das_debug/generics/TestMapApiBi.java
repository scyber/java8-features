package das_debug.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class TestMapApiBi {
    public static void main(String args[]){
        Map<String,Integer> counts = new HashMap<>();
        counts.put("Jenny",1);
        counts.put("Tom", 2);
        counts.put("Sam", 1);
        BiFunction<String,Integer,Integer> mapper = (k,v)-> v + 1;
        System.out.println(counts);
        counts.computeIfPresent("Jenny", mapper);
        counts.computeIfPresent("Tom", mapper);
        System.out.println(counts);

    }
}
