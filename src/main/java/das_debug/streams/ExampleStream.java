package das_debug.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {
    public static void main(String args[]){
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromParallelList = list.parallelStream();

        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1,x->x+2);

        //randoms.forEach(System.out::println);
        //for (int i=0; i<100; i++)
        randoms.limit(10).forEach(System.out::println);
        oddNumbers.limit(10).forEach(System.out::println);



    }
}
