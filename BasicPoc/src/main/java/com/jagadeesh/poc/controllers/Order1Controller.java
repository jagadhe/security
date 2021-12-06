package com.jagadeesh.poc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jagadeesh.poc.exception.ResourceNotFoundException;
import com.jagadeesh.poc.model.Order1;
import com.jagadeesh.poc.repo.Order1Repository;

@RequestMapping("/api/v1")
@RestController
public class Order1Controller {
	
	@Autowired
	private Order1Repository order1Repository;
	
	@RequestMapping(value = "/order1/",method = RequestMethod.GET)
	public List<Order1>getAllorder1(){
		return order1Repository.findAll();
		
	}
	@RequestMapping(value = "/order1/{orderId1}",method = RequestMethod.GET)
	public Order1 getOrder1(@PathVariable("orderId1") int orderId1) {
		return order1Repository.findById(orderId1).orElseThrow(() -> new ResourceNotFoundException("user not found with id:" +orderId1));
	}
	
	@RequestMapping(value="/order1/",method=RequestMethod.POST)
	public Order1 createorder1(@RequestBody Order1 order1) {
		return order1Repository.save(order1);
	}
	
	@RequestMapping(value="/order1/",method=RequestMethod.PUT)
	public Order1 updateorder1( @RequestBody Order1  order1) {
		return order1Repository.save(order1);

}
	@RequestMapping(value="/order1/{orderId1}",method=RequestMethod.DELETE)
	public void deleteorder1(@PathVariable("orderId1") int  orderId1) {
		 order1Repository.deleteById(orderId1);
		 }	

}
