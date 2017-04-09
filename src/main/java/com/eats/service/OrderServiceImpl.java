package com.eats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eats.models.Order;
import com.eats.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order getOrderById(Long orderId) {
		return orderRepository.findOne(orderId);
	}

}
