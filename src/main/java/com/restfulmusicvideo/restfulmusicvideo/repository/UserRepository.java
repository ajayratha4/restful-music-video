package com.restfulmusicvideo.restfulmusicvideo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restfulmusicvideo.restfulmusicvideo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

//	public List<User> findByuserNameAndPassword(String userName);
	User findOneByuserNameIgnoreCaseAndPassword(String userName, String password);

}
