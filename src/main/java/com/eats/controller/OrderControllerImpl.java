package com.eats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eats.models.Order;
import com.eats.service.OrderService;

@RestController("/orders")
public class OrderControllerImpl implements OrderController {

	@Autowired
	private OrderService orderService;

	@Override
	@RequestMapping("/user/{userId}")
	public List<Order> getOrdersForUser(@PathVariable Long userId) {
		return this.orderService.getOrdersForUser(userId);
	}

}
