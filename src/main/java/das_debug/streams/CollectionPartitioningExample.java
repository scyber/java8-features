package das_debug.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionPartitioningExample {
    public static void main(String args[]){


        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean,List<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map);

        ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean,List<String>> map1 = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map1);

        ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer,Long> map2 = ohMy.collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(map2);


        ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer,Optional<Character>> map3 = null ;//
        System.out.println(map3) ;
        /*
        Map<Integer,Optional<Character>> map3 = ohMy.collect(
                Collectors.groupingBy(
                String::length,
             Collectors.mapping(s->s.charAt(0),Collectors.minBy(Comparator.reverseOrder()))));

        System.out.println(map3);*/
    }
}
