package com.eats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.eats.service.OrderService;

@RestController
public class OrderControllerImpl implements OrderController {

	@Autowired
	private OrderService orderService;

}
