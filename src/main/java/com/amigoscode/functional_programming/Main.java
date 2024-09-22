package com.amigoscode.functional_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
//        sendEmail("jamila@amigoscode.com");
        sendEmailConsumer.accept("jamila@amigoscode.com");
        List<String> emails = List.of(
                "hello@amigoscode.com",
                "foo@amigoscode.com",
                "bar@amigoscode.com"
        );
        emails.forEach(Main::sendEmail);
    }

    static Consumer<String> sendEmailConsumer =
            email -> System.out.println("Sending email: " + email);

    static void sendEmail(String email) {
        System.out.println("Sending email to: " + email);
    }

}
