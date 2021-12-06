package com.jagadeesh.poc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jagadeesh.poc.exception.ResourceNotFoundException;
import com.jagadeesh.poc.model.Product;
import com.jagadeesh.poc.repo.ProductRepository;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(value = "/products/", method = RequestMethod.GET)
	public List<Product>getAllProducts(){
		return productRepository.findAll();
		
	}
	
	@RequestMapping(value = "/products/{productId}",method = RequestMethod.GET)
	public Product getProducts(@PathVariable("productId") int productId) {
		return productRepository.findById(productId).orElseThrow(() -> new ResourceNotFoundException("user not found with id:" +productId));
	}
	
	
	
	@RequestMapping(value="/products/",method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@RequestMapping(value="/products/",method=RequestMethod.PUT)
	public Product updateProduct( @RequestBody Product product) {
		return productRepository.save(product);

}
	@RequestMapping(value="/products/{productId}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("productId") int  productId) {
		 productRepository.deleteById(productId);
		 }
}

