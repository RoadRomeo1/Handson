package Handson.Method_Reference;

import java.util.function.Predicate;

@FunctionalInterface
public interface CustomPredicate <T> extends Predicate<T>{
    
    public boolean test(T t);
    
}
