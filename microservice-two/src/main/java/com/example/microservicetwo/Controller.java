package com.example.microservicetwo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-two")
public class Controller {
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Microservice Two!";
	}
}
