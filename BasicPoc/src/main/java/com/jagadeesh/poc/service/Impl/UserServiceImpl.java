package com.jagadeesh.poc.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagadeesh.poc.model.User;
import com.jagadeesh.poc.repo.UserRepository;
import com.jagadeesh.poc.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(int userid) {
		// TODO Auto-generated method stub
       
         Optional<User> userd = userRepository.findById(userid);
         User user = userd.get();
         user.setSoft_delete(true);
         userRepository.save(user);
	}

	@Override
	public User getUserById(int userid) {
		// TODO Auto-generated method stub
		return userRepository.findById(userid).get();
	}

	@Override
	public List<User> getallUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
