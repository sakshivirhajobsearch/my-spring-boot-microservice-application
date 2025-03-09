package com.example.security.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// For demonstration purposes, using hardcoded user.
		// Later this can be connected to a database.
		if (username.equals("admin")) {
			return new User("admin", "$2a$10$DowJnYghXtDfpqvcG6.NdeAxlI2DbnYqkVVuo35HfPLM7TVs6MxvK", new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
