package das_debug.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class TestMapApi {
    public static void main(String args[]){
        Map<String,String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Trip");
        favorites.put("Jenny", "Tram");
        favorites.putIfAbsent("Jenny", "Car");
        favorites.putIfAbsent("Tom", null);
        favorites.putIfAbsent("Sam", "Tram");
        System.out.println(favorites);

        BiFunction<String,String,String> mapper = (v1,v2)-> v1.length() > v2.length() ? v1 : v2;
        String jenny = favorites.merge("Jenny", "SkyRoad", mapper);
        String tom = favorites.merge("Tom", "SkyRoad", mapper);
        BiFunction<String,String,String> mapper2 = (v1,v2)-> null;
        System.out.println(favorites);
        jenny = favorites.merge("Tom", "Bus Tour", mapper2);
        tom = favorites.merge("Tom", "Bus Tour", mapper2);
        System.out.println(favorites);
    }
}
