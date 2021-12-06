package com.jagadeesh.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jagadeesh.poc.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
