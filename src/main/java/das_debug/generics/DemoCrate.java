package das_debug.generics;

public class DemoCrate {
    public static void main(String args[]) {
        Elephant elephant = new Elephant();
        Cratte<Elephant> elephantCratte = new Cratte<>();
        elephantCratte.packCrate(elephant);
        Elephant inNewHome = elephantCratte.emptyCrate();
        Integer numPounds = 10_500;
        SizeLimitCrate<Elephant, Integer> c1 = new SizeLimitCrate<>(elephant,numPounds);


    }
}
