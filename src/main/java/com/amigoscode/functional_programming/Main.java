package com.amigoscode.functional_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.function.Predicate;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        String email = "hello@amigoscode.com";
        System.out.println(isValidEmail(email));
        System.out.println(isValidEmailPredicate.test(email));

        boolean test = isValidEmailPredicate.and(containsDotPredicate).test(email);
        System.out.println(test);
    }

    // Functional approach
    private static Predicate<String> isValidEmailPredicate = email -> email.contains("@");
    private static Predicate<String> containsDotPredicate = email -> email.contains(".");

    // Imperative approach
    private static boolean isValidEmail(String email) {
        return email.contains("@");
    }

}
