package com.marino.alfredo.examples.functionalprogramming.operators;

public class AgeUtils {

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, String> dateToString = (day, month, year) -> day + "-" + month + "-" + year;

        System.out.println("dateToString.apply(15, 5, 1995) = " + dateToString.apply(15, 5, 1995));
    }
}
