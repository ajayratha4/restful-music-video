package com.restfulmusicvideo.restfulmusicvideo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.restfulmusicvideo.restfulmusicvideo.common.Response;
import com.restfulmusicvideo.restfulmusicvideo.dto.LoginRequestDTO;
import com.restfulmusicvideo.restfulmusicvideo.entity.User;
import com.restfulmusicvideo.restfulmusicvideo.repository.UserRepository;
import com.restfulmusicvideo.restfulmusicvideo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private Response response;

	@Override
	public Response createUser(User user) {

		User data = userRepository.save(user);

		response.setData(data);
		response.setStatus(HttpStatus.OK.value());

		return response;
	}

	@Override
	public Response login(LoginRequestDTO loginRequestDTO) {
		User data = userRepository.findOneByuserNameIgnoreCaseAndPassword(loginRequestDTO.getUserName(),
				loginRequestDTO.getPassword());

		if (data == null) {
			response.setData("User login failed");
			response.setStatus(HttpStatus.BAD_GATEWAY.value());
		} else {
			response.setData(data);
			response.setStatus(HttpStatus.OK.value());
		}

		return response;
	}

}
