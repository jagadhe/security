package com.jagadeesh.poc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jagadeesh.poc.exception.ResourceNotFoundException;
import com.jagadeesh.poc.model.User;
import com.jagadeesh.poc.repo.UserRepository;
import com.jagadeesh.poc.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/users/",method = RequestMethod.GET)
	public List<User>getAllUsers(){
		return userRepository.findAll();
		
	}
	
	@RequestMapping(value = "/users/{userId}",method = RequestMethod.GET)
	public User getUsers(@PathVariable("userId") int userId) {
		System.out.println("userId: " + userId);
		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("user not found with id:" +userId));
	}
	
	@RequestMapping(value="/users/",method=RequestMethod.POST)
	public User createUsers(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@RequestMapping(value="/users/",method=RequestMethod.PUT)
	public User updateUser( @RequestBody User user) {
		return userRepository.save(user);

}
	@RequestMapping(value="/users/{userId}",method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable("userId") int  userid) {
		userService.deleteUser(userid);
		
		 }	

}
