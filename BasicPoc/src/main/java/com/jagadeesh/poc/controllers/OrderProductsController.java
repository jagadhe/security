package com.jagadeesh.poc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jagadeesh.poc.exception.ResourceNotFoundException;
import com.jagadeesh.poc.model.OrderProducts;
import com.jagadeesh.poc.repo.OrderProductRepository;

@RestController
@RequestMapping("/api/v1")
public class OrderProductsController {
	
	@Autowired
	private OrderProductRepository orderProductRepository;
	
	@RequestMapping(value = "/orderProducts/",method = RequestMethod.GET)
	public List<OrderProducts>getAllorderProducts(){
		return orderProductRepository.findAll();
		
	}
	
	@RequestMapping(value = "/orderProducts/{orderItemId}",method = RequestMethod.GET)
	public OrderProducts getOrderProducts(@PathVariable("orderItemId") int orderItemId) {
		return orderProductRepository.findById(orderItemId).orElseThrow(() -> new ResourceNotFoundException("user not found with id:" +orderItemId));
	}
	
	
	
	
	@RequestMapping(value="/orderProducts/",method=RequestMethod.POST)
	public OrderProducts createorderProducts(@RequestBody OrderProducts orderProducts) {
		return orderProductRepository.save(orderProducts);
				
	}
	
	@RequestMapping(value="/orderProducts/",method=RequestMethod.PUT)
	public OrderProducts updateorderProducts( @RequestBody OrderProducts orderProducts) {
		return orderProductRepository.save(orderProducts);

}
	@RequestMapping(value="/orderProducts/{orderItemId}",method=RequestMethod.DELETE)
	public void deleteorderProducts(@PathVariable("orderItemId") int  orderItemId) {
		orderProductRepository.deleteById(orderItemId);
		 }	
	

}
