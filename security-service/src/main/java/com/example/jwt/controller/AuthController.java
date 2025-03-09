package com.example.jwt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.entity.User;
import com.example.jwt.repository.UserRepository;
import com.example.jwt.service.JwtService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private JwtService jwtService;

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User user) {
		// Encrypt the password
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		return ResponseEntity.ok("User registered successfully.");
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
		// Find user by username
		Optional<User> optionalUser = userRepository.findByUsername(user.getUsername());

		if (optionalUser.isPresent()) {
			User dbUser = optionalUser.get();

			// Compare passwords
			if (passwordEncoder.matches(user.getPassword(), dbUser.getPassword())) {
				// Generate JWT Token
				String token = jwtService.generateToken(dbUser.getUsername());
				return ResponseEntity.ok(token);
			} else {
				return ResponseEntity.status(401).body("Invalid Credentials");
			}
		}

		return ResponseEntity.status(404).body("User not found");
	}

}
