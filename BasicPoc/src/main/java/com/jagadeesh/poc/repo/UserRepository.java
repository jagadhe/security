package com.jagadeesh.poc.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jagadeesh.poc.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	void save(Optional<User> userd);

	
}
