package com.example.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.User;
import com.example.test.service.UserService;

@RestController
public class UserController {
	@Autowired UserService userService;
	
	@GetMapping(path = "/users")
	public List<User> getAllUsers() {
		return userService.getAll();
	}
	
	@GetMapping(path = "/users/{id}")
	public Optional<User> getUserById(@PathVariable("id") long id) {
		return userService.getUserById(id);
	}
	
	@PostMapping(path = "/users")
	public User addUser(@RequestBody User user) {
		return userService.add(user);
	}
	
	@PutMapping(path = "/users")
	public User updateUser(@RequestBody User user) {
		return userService.update(user);
	}
	
	@DeleteMapping(path = "/users/{id}")
	public void updateUser(@PathVariable("id") long id) {
		userService.delete(id);
	}
}
