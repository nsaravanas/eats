package com.eats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.eats.service.RestaurantService;

@RestController
public class RestaurantControllerImpl implements RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

}
