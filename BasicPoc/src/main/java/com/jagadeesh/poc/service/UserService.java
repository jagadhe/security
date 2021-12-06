package com.jagadeesh.poc.service;

import java.util.List;

import com.jagadeesh.poc.model.User;

public interface UserService {
	User saveUser(User user);

	User updateUser(User user);

	void deleteUser(int userid);

	User getUserById(int userid);

	List<User> getallUsers();

}
