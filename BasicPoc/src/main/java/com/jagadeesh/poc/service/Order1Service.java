package com.jagadeesh.poc.service;

import java.util.List;

import com.jagadeesh.poc.model.Order1;

public interface Order1Service {
	Order1 saveorOrder1(Order1 order1);

	Order1 updateOrder1(Order1 order1);

	void deleteOrder1(Order1 order1);

	Order1 getOrder1ById(int  orderId1);

	List<Order1> getallOrder1();

	

}
