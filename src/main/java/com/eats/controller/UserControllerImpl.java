package com.eats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eats.commons.CommonStubs;
import com.eats.models.User;
import com.eats.service.UserService;

@RestController
@RequestMapping("/users")
public class UserControllerImpl implements UserController {

	@Autowired
	private UserService userService;

	@Override
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	public User findByUserById(Long userId) {
		return this.userService.findByUserById(userId);
	}

	@RequestMapping(value = "/sampleuser", method = RequestMethod.GET)
	public User testUser() {
		return CommonStubs.testUser();
	}

}
