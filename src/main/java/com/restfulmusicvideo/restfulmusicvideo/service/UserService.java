package com.restfulmusicvideo.restfulmusicvideo.service;

import com.restfulmusicvideo.restfulmusicvideo.common.Response;
import com.restfulmusicvideo.restfulmusicvideo.dto.LoginRequestDTO;
import com.restfulmusicvideo.restfulmusicvideo.entity.User;

public interface UserService {

	public Response createUser(User user);

	public Response login(LoginRequestDTO loginRequestDTO);

}
