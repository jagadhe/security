package com.jagadeesh.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jagadeesh.poc.model.Role;

public interface Rolerepo extends JpaRepository<Role, Long> {

}
