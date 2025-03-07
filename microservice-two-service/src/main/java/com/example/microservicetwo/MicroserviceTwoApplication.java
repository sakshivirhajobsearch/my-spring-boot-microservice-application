package com.example.microservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MicroserviceTwoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceTwoApplication.class, args);
	}

	@GetMapping("/service-two/hello")
	public String hello() {
		return "Hello from Microservice Two";
	}
}
