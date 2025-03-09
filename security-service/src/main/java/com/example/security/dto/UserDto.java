package com.example.security.dto;

import com.example.security.entity.User;

public class UserDto {

	private String username;
	private String password;
	private String role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public UserDto() {
	}

	public UserDto(User user) {
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.role = user.getRole();
	}

}