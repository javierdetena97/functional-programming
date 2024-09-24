package com.amigoscode.functional_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.function.Supplier;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        System.out.println(getUrlSupplier.get());
    }

    // Functional approach
    private static Supplier<List<String>> getUrlSupplier = () -> {
        // logic
        return List.of("https://amigoscode.com");
    };

    // Imperative approach
    private static String getUrl() {
        return "https://amigoscode.com";
    }

}
