package com.marino.alfredo.examples.functionalprogramming.operators;

//Ejemplo funciones de orden mayor

import java.util.function.IntUnaryOperator;

public class ComposeExample {

    public static void main(String[] args) {

        IntUnaryOperator multiplyBy3 = x -> x * 3;

        IntUnaryOperator add1MultiplyBy3 = multiplyBy3.compose(y -> y + 1);

        System.out.println(add1MultiplyBy3.applyAsInt(2));

//
//
//
//
//
//        IntUnaryOperator andSquare = add1MultiplyBy3.andThen(z -> z * z);
//
//        System.out.println(andSquare.applyAsInt(2));
    }
}
