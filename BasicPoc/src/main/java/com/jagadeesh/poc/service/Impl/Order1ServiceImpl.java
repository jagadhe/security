package com.jagadeesh.poc.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagadeesh.poc.model.Order1;
import com.jagadeesh.poc.repo.Order1Repository;
import com.jagadeesh.poc.service.Order1Service;
@Service
public class Order1ServiceImpl implements Order1Service {

	@Autowired
	private Order1Repository order1Repository;
	@Override
	public Order1 saveorOrder1(Order1 order1) {
		// TODO Auto-generated method stub
		return order1Repository.save(order1);
	}

	@Override
	public Order1 updateOrder1(Order1 order1) {
		// TODO Auto-generated method stub
		return order1Repository.save(order1);
	}

	@Override
	public void deleteOrder1(Order1 order1) {
		// TODO Auto-generated method stub
      order1Repository.delete(order1);
	}

	@Override
	public Order1 getOrder1ById(int orderId1) {
		// TODO Auto-generated method stub
		return order1Repository.findById(orderId1).get();
		
	}

	@Override
	public List<Order1> getallOrder1() {
		// TODO Auto-generated method stub
		return order1Repository.findAll();
	}

}
