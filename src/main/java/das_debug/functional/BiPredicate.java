package das_debug.functional;

@FunctionalInterface
public interface BiPredicate<T, U> {
    boolean test(T t, U u);
}
