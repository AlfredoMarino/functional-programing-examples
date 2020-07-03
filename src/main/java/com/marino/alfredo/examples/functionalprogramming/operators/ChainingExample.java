package com.marino.alfredo.examples.functionalprogramming.operators;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChainingExample {

    public static void main(String[] args) {
        List<Person> persons = Stream
                .generate(() -> {
                    int age = (int) Math.round(Math.random() * 100);
                    String name = "alfredo" + age;
                    return new Person(name, age);
                })
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

        persons.stream()
                .filter(person -> person.age >= 18)
                .map(person -> person.name)
                .forEach(System.out::println);

    }


    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
