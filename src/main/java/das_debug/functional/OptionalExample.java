package das_debug.functional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String args[]){

        System.out.println(average());
        System.out.println(average(90,100));

        Optional<Double> opt = average(90,100);
        if (opt.isPresent())
            System.out.println(opt.get());

        opt = average();
        if (opt.isPresent())
            System.out.println(opt.get());

        System.out.println("--------");
        opt = average(90,100);
        opt.ifPresent(System.out::println);
        System.out.println("--------");
        opt = average(90,100);
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(()->Math.random()));
        System.out.println(opt.orElseThrow(()-> new IllegalStateException()));

        opt = average();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(()->Math.random()));
        System.out.println(opt.orElseThrow(()-> new IllegalStateException()));

   }

    public static Optional<Double> average (int...scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score:scores)sum += score;
        return Optional.of((double) sum/scores.length);
    }
}


