package das_debug.functional;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
