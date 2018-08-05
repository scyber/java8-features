package das_debug.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String []args){
        Stream<String> stream = Stream.of("monkey", "gorilla", "chimpansee");
        stream.filter(x->x.startsWith("m")).forEach(System.out::println);


        Stream<String> s = Stream.of("chuck", "chuck", "chuck" , "chuck", "chimpansee");
        s.distinct().forEach(System.out::println);
       
        
        System.out.println("Iterate example ");
        Stream<Integer> integerStream = Stream.iterate(1,x->x+1);
        integerStream.skip(2).limit(5).forEach(System.out::println);
        System.out.println("Finish iterate example");

        Stream<String> sMap = Stream.of("gorilla", "chuck", "chimpansee");
        System.out.println("ToDo map ");
        sMap.map(String::length).forEach(System.out::println);
        System.out.println("Finish map");

        //Using FlatMap example
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Badoo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");

        Stream<List<String>> s1 = Stream.of(zero,one,two);
        s1.flatMap(l->l.stream()).forEach(StreamFilterExample::print);


        //sorted method example
        Stream<String> sorted = Stream.of("brown bear-", "bear-");
        sorted.sorted().forEach(StreamFilterExample::print);

        //Using Comparator interface
        Stream<String> revSorted = Stream.of("brown bear --", "grizly bear");
        revSorted.sorted(Comparator.reverseOrder()).forEach(StreamFilterExample::print);


    }
    public static void print(String x){
        System.out.println(x);
    }
}
