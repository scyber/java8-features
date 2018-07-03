package das_debug.functional;

@FunctionalInterface
public interface BiFunction<T, U, R> {
    R appy(T t, U u);
}
