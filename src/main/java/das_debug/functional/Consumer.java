package das_debug.functional;
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
