package com.amigoscode.functional_programming;

public class Hotmail implements EmailSender {

    @Override
    public void send() {
        System.out.println("Sending email using Hotmail...");
    }

}
