package com.jagadeesh.poc.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagadeesh.poc.model.OrderProducts;
import com.jagadeesh.poc.repo.OrderProductRepository;
import com.jagadeesh.poc.service.OrderProductsService;
@Service
public class OrderProductsServiceImpl implements OrderProductsService {
@Autowired
 private OrderProductRepository orderProductRepository;
	
	@Override
	public OrderProducts saveOrderProducts(OrderProducts orderProducts) {
		// TODO Auto-generated method stub
		return orderProductRepository.save(orderProducts);
	}

	@Override
	public OrderProducts updateOrderProducts(OrderProducts orderProducts) {
		// TODO Auto-generated method stub
		return orderProductRepository.save(orderProducts);
	}

	@Override
	public void deleteOrderProducts(OrderProducts orderProducts) {
		// TODO Auto-generated method stub
         orderProductRepository.delete(orderProducts);
	}

	@Override
	public OrderProducts getOrderPtoductsById(int orderItemId) {
		// TODO Auto-generated method stub
		return orderProductRepository.findById(orderItemId).get();
	}

	@Override
	public List<OrderProducts> getallOrderProducts() {
		// TODO Auto-generated method stub
		return orderProductRepository.findAll();
	}

}
