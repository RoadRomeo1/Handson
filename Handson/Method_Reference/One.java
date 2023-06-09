package Handson.Method_Reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


class One{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Long no = sc.nextLong();
        boolean res = true;
        
        if(no <= 1)
        res = false;
        else
        res = !LongStream.rangeClosed(2, no).filter(n -> (no%n != 0) && (n != no)).findAny().isPresent();
                
        System.out.println(res ? "prime" : "not prime");


    }
}   