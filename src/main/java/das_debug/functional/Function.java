package das_debug.functional;

@FunctionalInterface
public interface Function<T,R> {
    R appy(T t);
}
