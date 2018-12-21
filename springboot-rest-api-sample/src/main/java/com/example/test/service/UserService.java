package com.example.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.entity.User;
import com.example.test.repository.UserRepository;

@Service
public class UserService {
	@Autowired UserRepository userRepo;
	
	public List<User> getAll() {
		return (List<User>) userRepo.findAll();
	}
	
	public Optional<User> getUserById(long id) {
		return userRepo.findById(id);
	}
	
	public User add(User user) {
		return userRepo.save(user);
	}
	
	public User update(User user) {
		return userRepo.save(user);
	}
	
	public void delete(long id) {
		userRepo.deleteById(id);
	}
}
