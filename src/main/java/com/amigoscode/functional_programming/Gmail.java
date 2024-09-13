package com.amigoscode.functional_programming;

public class Gmail implements EmailSender {

    @Override
    public void send() {
        System.out.println("Sending email using Gmail...");
    }

}
