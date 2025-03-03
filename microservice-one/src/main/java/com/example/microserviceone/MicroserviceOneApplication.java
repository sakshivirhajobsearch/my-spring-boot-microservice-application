package com.example.microserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MicroserviceOneApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOneApplication.class, args);
	}
}
