package com.example.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecurityServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SecurityServiceApplication.class, args);

		// Forcefully shutdown the application when stopped
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			System.out.println("Application shutting down. Closing Hikari Connection Pool...");
			context.close();
		}));
	}
}
