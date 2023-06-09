package Handson.Method_Reference;

import java.util.function.Consumer;

@FunctionalInterface
public interface CustomConsumer<T> extends Consumer<T>{
    public void accept(T t);
}
