package com.marino.alfredo.examples.functionalprogramming.operators;

import java.util.function.*;

public class StringFunctions {

    public static void main(String[] args) {
        Function<String, String> quote = text -> "\"" + text + "\"";
        System.out.println(quote.apply("Ser o no ser") + " - Hamlet");

        UnaryOperator<String> quoteUnaryOperator = text -> "\"" + text + "\"";
        System.out.println(quoteUnaryOperator.apply("Ser o no ser") + " - Hamlet");


        BiFunction<Integer, Integer, Integer> multiplication = (x, y) -> x * y;
        System.out.println("multiplication: " + multiplication.apply(2, 2));

        BinaryOperator<Integer> multiplicationBinaryOperator = (x, y) -> x * y;
        System.out.println("multiplicationBinaryOperator: " + multiplicationBinaryOperator.apply(2, 2));

        IntBinaryOperator multiplicationIntBinaryOperator = (x, y) -> x * y;
        System.out.println("multiplicationIntBinaryOperator: " + multiplicationIntBinaryOperator.applyAsInt(2, 2));
    }
}
