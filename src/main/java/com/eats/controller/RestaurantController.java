package com.eats.controller;

import java.util.List;

import com.eats.models.Restaurant;

public interface RestaurantController {

	Restaurant getRestaurantById(Long restaurantId);

	List<Restaurant> getAllRestaurants();

}
