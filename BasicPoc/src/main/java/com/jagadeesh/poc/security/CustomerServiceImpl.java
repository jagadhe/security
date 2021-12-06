package com.jagadeesh.poc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jagadeesh.poc.model.Customer;
import com.jagadeesh.poc.repo.CustomerRepo;
@Service
public class CustomerServiceImpl implements UserDetailsService {
	@Autowired
	CustomerRepo customerRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Customer customer = customerRepo.findByEmail(username);
		if(customer == null) {
			throw new UsernameNotFoundException("username not found for email" +username);
		}
	 return new User(customer.getEmail(), customer.getPassword(), customer.getRoles());
	}

}
