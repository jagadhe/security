package com.jagadeesh.poc.service;

import java.util.List;

import com.jagadeesh.poc.model.OrderProducts;

public interface OrderProductsService {
	OrderProducts saveOrderProducts(OrderProducts orderProducts);

	OrderProducts updateOrderProducts(OrderProducts orderProducts);

	void deleteOrderProducts(OrderProducts orderProducts);

	OrderProducts getOrderPtoductsById(int  orderItemId);

	List<OrderProducts> getallOrderProducts();

}
