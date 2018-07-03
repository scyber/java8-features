package das_debug.streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveExamples {
    public static void main(String args[]){

        Stream<Integer> stream = Stream.of(1,2,3);
        System.out.println(stream.reduce(0,(s,n)-> s+n));

        //Advanced Integer options
        Stream<Integer> streamInt = Stream.of(1,2,3);
        System.out.println(streamInt.mapToInt(x->x).sum());

        IntStream is = IntStream.range(1,6);
        is.forEach(System.out::println);

        IntStream count = IntStream.iterate(1,x->x+1).limit(5);
        count.forEach(System.out::print);
        System.out.println();
        IntStream intStreamClosed = IntStream.rangeClosed(1,5);
        intStreamClosed.forEach(System.out::print);
        System.out.println();
        LongStream ls = LongStream.of(5,10,15,20);
        System.out.println(ls.sum());


    }
}
