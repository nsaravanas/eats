package com.eats.service;

import java.util.List;

import com.eats.models.Order;

public interface OrderService {

	List<Order> getOrdersForUser(Long userId);

}
