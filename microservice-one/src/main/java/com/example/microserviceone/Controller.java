package com.example.microserviceone;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-one")
public class Controller {
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Microservice One!";
	}
}
