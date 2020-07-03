package com.marino.alfredo.examples.functionalprogramming.functions;

import java.util.function.Function;

public class Square implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer x) {
        return x * x;
    }
}
