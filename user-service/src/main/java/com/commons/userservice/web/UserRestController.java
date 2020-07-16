package com.commons.userservice.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.commons.userservice.entity.User;
import com.commons.userservice.service.UserService;

@RestController
@RequestMapping("user")
public class UserRestController {

	@Autowired
	UserService userService;
	
	@GetMapping()
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("/{id}")
	public User read(@PathVariable Long id) {
		User user = userService.findById(id).orElse(null);
		return user;
	}

}
