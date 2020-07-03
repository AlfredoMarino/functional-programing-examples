package com.marino.alfredo.examples.functionalprogramming.operators;

public class AgeUtils {

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, String> dateToString = (day, month, year) -> day.toString() + "-" + month + "-" + year;

        System.out.println("dateToString.apply(5, 15, 1995) = " + dateToString.apply(5, 15, 1995));
    }
}
