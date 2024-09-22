package com.amigoscode.functional_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        sendEmailBiConsumer.accept(
                "hello@amigoscode.com",
                "jamila@amigoscode.com"
        );
    }

    static BiConsumer<String, String> sendEmailBiConsumer =
            (from, to) -> System.out.printf("Sending email from %s to %s%n", from, to);

    static void sendEmail(String from, String to) {
        System.out.printf("Sending email from %s to %s%n", from, to);
    }

}
