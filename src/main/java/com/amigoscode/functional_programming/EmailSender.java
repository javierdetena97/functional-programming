package com.amigoscode.functional_programming;

@FunctionalInterface
public interface EmailSender {
    boolean send(String from, String to);
}
