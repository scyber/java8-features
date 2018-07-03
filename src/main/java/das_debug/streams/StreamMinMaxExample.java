package das_debug.streams;



import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMinMaxExample {
    public static void main(String args[]){
        Stream<String> animals = Stream.of("Gorilla", "ap", "Chimpansee");
        Optional<String> min = animals.min((x1,x2) -> x1.length() - x2.length() );
        min.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((s1,s2)->0);
        System.out.println(minEmpty.isPresent());

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(()->"chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        List<String> list = Arrays.asList("mokey", "2", "chimp");
        Stream<String> inf = Stream.generate(()->"chimp");

        Predicate<String> pred = x->Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().allMatch(pred));

        s = Stream.of("monkey", "gorilla", "chip");
        s.forEach(System.out::println);

        Stream<String> stream = Stream.of("w","o","l","f");
        String word = stream.reduce("", (a,c)-> a + c);
        System.out.println(word);

        Stream<Integer> integerStream = Stream.of(3,5,6);
        System.out.println(integerStream.reduce(1,(a1,a2)->a1*a2));


        Stream<String> streamBuilder = Stream.of("w", "o", "l", "f");
        StringBuilder sb = streamBuilder.collect(StringBuilder::new,StringBuilder::append,StringBuilder::append);
        System.out.println(sb);

        //TreeSet example
        Stream<String> setStream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = setStream.collect(TreeSet::new,TreeSet::add,TreeSet::addAll);
        System.out.println(set);


        //TreeSet with Interface Collectors
        Stream<String> stringStream = Stream.of("w", "o", "l", "f");
        TreeSet<String> stringTreeSet = stringStream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(stringTreeSet);

        //peek example
        Stream<String> peekExample = Stream.of("black bear", "brown beak", "grizzly bear", "gosha bear");
        long count = peekExample.filter(x->x.startsWith("g")).peek(System.out::println).count();

        System.out.println(count);

        List<String> listString = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        listString.stream()
                .filter(l->l.length() == 4)
                .limit(2)
                .forEach(System.out::println);

        //Example Peek Behind
        Stream<Integer> integerStream1 = Stream.iterate(1, x->x+1);
        integerStream1.
                limit(5).
                filter( x->x % 2 == 1)
                .forEach(System.out::print);
        System.out.println();
        //
        System.out.println("Difference behind the peek");
        Stream<Integer> integerStream2 = Stream.iterate(1,x->x+1);
        integerStream2.limit(5)
                .peek(System.out::print)
                .filter(x->x % 2 == 1)
                .forEach(System.out::print);



    }
}
