package com.restfulmusicvideo.restfulmusicvideo.repository;

import org.springframework.data.repository.CrudRepository;

import com.restfulmusicvideo.restfulmusicvideo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
