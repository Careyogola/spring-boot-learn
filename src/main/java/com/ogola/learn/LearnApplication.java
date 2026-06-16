package com.ogola.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import foobar.WelcomeMessage;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);

		var welcomeMessage = new WelcomeMessage(); // instance 
	    System.out.println(welcomeMessage.getWelcomeMessage());

		
	}

}