package com.project.medlife.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/view-all-user")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

	@PostMapping(value = "/LogIn")
	public User login(@RequestBody LogInDTO logInDTO) {
		return userService.LogIn(logInDTO);
	}
}
