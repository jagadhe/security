package com.jagadeesh.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jagadeesh.poc.model.OrderProducts;
@Repository
public interface OrderProductRepository extends JpaRepository<OrderProducts, Integer> {

}
