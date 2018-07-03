package das_debug.generics;

public class SizeLimitCrate<T,U> {
    private T contents;
    private U sizeLimit;
    public SizeLimitCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }
}
