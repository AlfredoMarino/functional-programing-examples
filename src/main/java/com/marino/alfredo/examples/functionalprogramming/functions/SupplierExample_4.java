package com.marino.alfredo.examples.functionalprogramming.functions;

import java.util.function.Supplier;

public class SupplierExample_4 {

    public static void main(String[] args) {

        Supplier<Double> generateRandomNumber = () -> Math.random();

        System.out.println(generateRandomNumber.get());
        System.out.println(generateRandomNumber.get());
    }
}
