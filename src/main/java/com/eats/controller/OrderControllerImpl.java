package com.eats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eats.models.Order;
import com.eats.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderControllerImpl implements OrderController {

	@Autowired
	private OrderService orderService;

	@Override
	@RequestMapping("order/{orderId}")
	public Order getOrderById(@PathVariable Long orderId) {
		return this.orderService.getOrderById(orderId);
	}

}
