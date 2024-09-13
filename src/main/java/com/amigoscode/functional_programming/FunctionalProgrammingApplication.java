package com.amigoscode.functional_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FunctionalProgrammingApplication {

    public static void main(String[] args) {
        EmailSender gmail = (from, to) -> {
            System.out.println("Sending email using Gmail");
            return false;
        };

        EmailSender hotmail = (from, to) -> {
            System.out.println("Sending email using Hotmail");
            return true;
        };

        boolean wasGmailSent = gmail.send("hello@amigoscode.com", "alex@gmail.com");
        boolean wasHotmailSent = hotmail.send("hello@amigoscode.com", "jamila@gmail.com");
    }

}
