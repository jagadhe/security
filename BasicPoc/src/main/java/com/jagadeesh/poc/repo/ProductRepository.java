package com.jagadeesh.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jagadeesh.poc.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

/*	Optional<Product> findById(Product product);

	void delete(Optional<Product> product);

	void save(Optional<Product> product); */

}
