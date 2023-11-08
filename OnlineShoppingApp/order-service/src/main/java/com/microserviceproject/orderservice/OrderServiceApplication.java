package com.microserviceproject.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OrderServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(OrderServiceApplication.class, args);
	}

}
