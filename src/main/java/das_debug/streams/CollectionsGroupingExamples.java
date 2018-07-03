package das_debug.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionsGroupingExamples {
    public static void main(String args[]){
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer,List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
        System.out.println(map);

        ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer,Set<String>> map1 = ohMy.collect(Collectors.groupingBy(String::length,Collectors.toSet()));
        System.out.println(map1);

        ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer,Set<String>> map2 = ohMy.collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.toSet()));
        System.out.println(map2);



    }
}
