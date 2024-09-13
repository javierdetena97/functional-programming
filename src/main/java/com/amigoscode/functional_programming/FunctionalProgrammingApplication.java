package com.amigoscode.functional_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class FunctionalProgrammingApplication {

    public static void main(String[] args) {
        List<String> names = List.of("Jamila", "Alex", "Mariam");
        Consumer<String> stringConsumer = name -> System.out.println(name);

        names.forEach(stringConsumer);
//        names.forEach(name -> System.out.println(name));
    }
}
