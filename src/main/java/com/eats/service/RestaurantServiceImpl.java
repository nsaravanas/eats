package com.eats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eats.models.Restaurant;
import com.eats.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;

	@Override
	public Restaurant getRestaurantById(Long restaurantId) {
		return this.restaurantRepository.findOne(restaurantId);
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		return this.restaurantRepository.findAll();
	}

}
