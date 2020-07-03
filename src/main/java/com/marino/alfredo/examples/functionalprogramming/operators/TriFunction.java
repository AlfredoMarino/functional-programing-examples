package com.marino.alfredo.examples.functionalprogramming.operators;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
