package Handson.Method_Reference;

import java.util.function.Function;

@FunctionalInterface
public interface CustomFunction <T, R> extends Function<T, R>{
    public R apply(T t);
}
