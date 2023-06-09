package Handson.Method_Reference;

import java.util.function.Supplier;

@FunctionalInterface
public interface CustomSupplier<R> extends Supplier<R>{
       public R get(); 
}

