package com.marino.alfredo.examples.functionalprogramming.functions;

import java.util.function.Supplier;

public class SupplierExample_4 {

    public static void main(String[] args) {

        Supplier<Long> generateRandomNumber = () -> Math.round(Math.random() * 100);

        System.out.println(generateRandomNumber.get());
        System.out.println(generateRandomNumber.get());
    }
}
