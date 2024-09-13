package com.amigoscode.functional_programming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FunctionalProgrammingApplication {

	public static void main(String[] args) {
		EmailSender emailSender = new Gmail();
		emailSender.send();
	}

}
