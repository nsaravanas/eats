package com.eats.controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eats.models.Restaurant;
import com.eats.service.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantControllerImpl implements RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@Override
	@RequestMapping(value = "/restaurant/{restaurantId}", method = RequestMethod.GET)
	public Restaurant getRestaurantById(@PathVariable Long restaurantId) {
		return this.restaurantService.getRestaurantById(restaurantId);
	}

	@Override
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Restaurant> getAllRestaurants() {
		return this.restaurantService.getAllRestaurants();
	}

}
