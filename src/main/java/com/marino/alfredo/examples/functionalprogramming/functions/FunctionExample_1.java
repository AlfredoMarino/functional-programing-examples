package com.marino.alfredo.examples.functionalprogramming.functions;

import java.util.function.Function;

public class FunctionExample_1 {

    public static void main(String[] args) {

        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println("squareFunction: " + squareFunction.apply(5));


        System.out.println("square: " + square(5));
    }

    public static int square(int x) {
        return x * x;
    }
}
