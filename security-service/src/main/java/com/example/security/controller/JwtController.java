package com.example.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.dto.JwtRequest;
import com.example.security.dto.JwtResponse;
import com.example.security.service.JwtService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class JwtController {

	@Autowired
	private JwtService jwtService;

	@PostMapping("/login")
	public JwtResponse createToken(@RequestBody JwtRequest jwtRequest) throws Exception {
		String token = jwtService.generateToken(jwtRequest.getUsername());
		return new JwtResponse(token);
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Microservice Security!";
	}
}
