package com.eats.service;

import java.util.List;

import com.eats.models.Restaurant;

public interface RestaurantService {

	Restaurant getRestaurantById(Long restaurantId);

	List<Restaurant> getAllRestaurants();

}
