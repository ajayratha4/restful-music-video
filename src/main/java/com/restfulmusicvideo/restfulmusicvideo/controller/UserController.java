package com.restfulmusicvideo.restfulmusicvideo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restfulmusicvideo.restfulmusicvideo.common.Response;
import com.restfulmusicvideo.restfulmusicvideo.dto.LoginRequestDTO;
import com.restfulmusicvideo.restfulmusicvideo.entity.User;
import com.restfulmusicvideo.restfulmusicvideo.service.UserService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/create")
	public ResponseEntity<Response> createUser(@RequestBody User user) {

		Response response = this.userService.createUser(user);

		return ResponseEntity.status(response.getStatus()).body(response);

	}

	@GetMapping(path = "/login")
	public ResponseEntity<Response> login(@RequestParam String userName, String password) {

		LoginRequestDTO loginRequestDTO = new LoginRequestDTO(userName, password);
		Response response = this.userService.login(loginRequestDTO);

		return ResponseEntity.status(response.getStatus()).body(response);

	}

}
