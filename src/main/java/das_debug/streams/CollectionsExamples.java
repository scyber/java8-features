package das_debug.streams;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsExamples {
    public static void main(String args[]){
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result);

        ohMy = Stream.of("lions", "tigers", "bears");
        Double resultDouble = ohMy.collect(Collectors.averagingInt(String::length));

        System.out.println(resultDouble);

        ohMy = Stream.of("lions", "tigers", "bears");
        TreeSet<String> stringTreeSet = ohMy.filter(s->s.startsWith("t")).collect(Collectors.toCollection(TreeSet::new));

        System.out.println(stringTreeSet);

        ohMy = Stream.of("lions", "tigers", "bears");
        Map<String,Integer> map = ohMy.collect(Collectors.toMap(s->s,String::length));
        System.out.println(map);

        ohMy = Stream.of("lions", "tigers", "bears");

        Map<Integer,String> map2 = ohMy.collect(Collectors.toMap(String::length,k->k,(s1,s2)->s1 + "," + s2));
        System.out.println(map2);
        System.out.println(map2.getClass());

        ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer,String> map1 = ohMy.collect(Collectors.toMap(String::length,k->k,(s1,s2)-> s1 + "," +s2, TreeMap::new));
        System.out.println(map1);
        System.out.println(map1.getClass());

    }
}
