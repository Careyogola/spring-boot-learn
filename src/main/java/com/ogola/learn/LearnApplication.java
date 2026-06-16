package com.ogola.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ogola.learn.foobar.WelcomeMessage;

@SpringBootApplication
public class LearnApplication {

	private static final Logger log = LoggerFactory.getLogger(LearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);

		log.info("Application started successfully!");

		var welcomeMessage = new WelcomeMessage(); // instance 
	    System.out.println(welcomeMessage.getWelcomeMessage());


	}

}
