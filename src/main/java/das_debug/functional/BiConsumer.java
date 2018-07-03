package das_debug.functional;
@FunctionalInterface
public interface BiConsumer<T, U> {
    void accept(T t, U u);
}
