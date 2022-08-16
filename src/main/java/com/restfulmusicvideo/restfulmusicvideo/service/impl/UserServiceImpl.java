package com.restfulmusicvideo.restfulmusicvideo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restfulmusicvideo.restfulmusicvideo.entity.User;
import com.restfulmusicvideo.restfulmusicvideo.repository.UserRepository;
import com.restfulmusicvideo.restfulmusicvideo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

}
