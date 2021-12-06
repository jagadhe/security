package com.jagadeesh.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jagadeesh.poc.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
	 Customer findByEmail(String email);

}
