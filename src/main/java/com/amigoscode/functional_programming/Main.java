package com.amigoscode.functional_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.BiFunction;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        Person jamila = personMapperBiFunc.apply("Jamila", 18);
        System.out.println(jamila);
    }

    record Person(String name, int age) {}

    static BiFunction<String, Integer, Person> personMapperBiFunc = Person::new;

    static Person personMapper(String name, int age) {
        return new Person(name, age);
    }
}
