package das_debug.generics;

public class Cratte<T> {
    private T contents;
    public T emptyCrate() {
        return contents;
    }
    public void packCrate(T contents) {
        this.contents = contents;
    }
    public static <T> Cratte <T> ship (T t){
        System.out.println("Preparing " + t) ;
        return new Cratte<>();
    }
}
