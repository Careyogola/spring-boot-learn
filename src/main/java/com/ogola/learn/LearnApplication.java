package com.ogola.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

//import com.ogola.learn.foobar.WelcomeMessage;

@SpringBootApplication
public class LearnApplication {

	private static final Logger logger = LoggerFactory.getLogger(LearnApplication.class);

	public static void main(String[] args) {
		//SpringApplication.run(LearnApplication.class, args);

		var orderService = new OrderService(new PayPalPaymentService());
		orderService.placeOrder();

		 logger.info("Application started successfully!");

		// var welcomeMessage = new WelcomeMessage(); // instance 
	    // System.out.println(welcomeMessage.getWelcomeMessage());


	}

}
