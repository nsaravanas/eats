package com.eats.controller;

import java.util.List;

import com.eats.models.Order;

public interface OrderController {

	List<Order> getOrdersForUser(Long userId);

}
