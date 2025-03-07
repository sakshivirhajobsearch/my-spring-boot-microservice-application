package com.example.microserviceone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MicroserviceOneApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceOneApplication.class, args);
	}

	@GetMapping("/service-one/hello")
	public String hello() {
		return "Hello from Microservice One";
	}
}
