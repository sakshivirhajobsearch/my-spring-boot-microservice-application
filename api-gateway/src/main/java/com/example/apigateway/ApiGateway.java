package com.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiGateway extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(ApiGateway.class, args);
	}
}
