package com.marino.alfredo.examples.functionalprogramming.functions;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample_2 {

    public static void main(String[] args) {

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;
        System.out.println("isOdd.apply(7) = " + isOdd.apply(7));

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println("isEven.test(7) = " + isEven.test(7));

    } 
}
