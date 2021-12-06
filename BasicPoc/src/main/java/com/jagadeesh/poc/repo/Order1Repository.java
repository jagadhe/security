package com.jagadeesh.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jagadeesh.poc.model.Order1;
@Repository
public interface Order1Repository extends JpaRepository<Order1, Integer> {

}
