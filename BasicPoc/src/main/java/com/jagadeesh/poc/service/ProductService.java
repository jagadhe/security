package com.jagadeesh.poc.service;

import java.util.List;

import com.jagadeesh.poc.model.Product;

public interface ProductService {
	Product saveProduct(Product product);

	Product updateProduct(Product product);

	void deleteProduct(Product product);

	Product getProductById(int  productId);

	List<Product> getallProducts();

}
