package com.marino.alfredo.examples.functionalprogramming.operators;

import java.util.List;
public class ChainingExample {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("alfredo", 25),
                new Person("Raul", 70),
                new Person("marco", 15)
        );

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
    }
}
