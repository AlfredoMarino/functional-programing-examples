package com.marino.alfredo.examples.functionalprogramming.functions;

import java.util.function.Consumer;

public class ConsumerExample_3 {

    public static void main(String[] args) {

        Consumer<String> showAsUpperCase = x -> System.out.println(x.toUpperCase());

        showAsUpperCase.accept("hello world");

    }
}
