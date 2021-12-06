package com.jagadeesh.poc.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagadeesh.poc.model.Product;
import com.jagadeesh.poc.repo.ProductRepository;
import com.jagadeesh.poc.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Product product) {
		/*Optional<Product> product1 = productRepository.findById(product.getProductId());
		
		product.setSoft_delete(false);*/
      productRepository.save(product);
	}

	@Override
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId).get();
	}

	@Override
	public List<Product> getallProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
