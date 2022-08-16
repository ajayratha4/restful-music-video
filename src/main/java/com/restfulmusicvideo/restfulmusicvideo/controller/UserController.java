package com.restfulmusicvideo.restfulmusicvideo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfulmusicvideo.restfulmusicvideo.entity.User;
import com.restfulmusicvideo.restfulmusicvideo.service.UserService;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/create")
	public User createUser(@RequestBody User user) {
		return this.userService.createUser(user);

	}

}
