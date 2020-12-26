package com.pralay.repository;

import java.io.Serializable;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Serializable> {
	User findByEmailId(String emailId);
	User findByEmailIdAndPassword(String emailId, String password);
}
