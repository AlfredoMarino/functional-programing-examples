package com.marino.alfredo.examples.functionalprogramming.operators;

import java.util.List;

public class Reference {

    public static void main(String[] args) {
        List<String> names = List.of("Maria", "pedro", "Ramon");

        names.forEach(name -> print(name));
        


//        System.out.println("/////////////////");
//        names.forEach(Reference::print);
    }

    public static void print(String text) {
        System.out.println(text + "...");
    }

}
