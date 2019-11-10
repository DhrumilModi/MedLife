package com.project.medlife.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	public User LogIn(LogInDTO logInDTO) {
		return userRepo.findByEmailIdAndPassword(logInDTO.getEmail(), logInDTO.getPassword());
	}
}
