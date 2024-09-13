package com.amigoscode.functional_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FunctionalProgrammingApplication {

    public static void main(String[] args) {
        EmailSender gmail = () -> System.out.println("Sending email using Gmail");
        EmailSender hotmail = () -> System.out.println("Sending email using Hotmail");

        gmail.send();
        hotmail.send();
    }

}
