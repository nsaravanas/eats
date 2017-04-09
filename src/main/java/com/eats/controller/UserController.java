package com.eats.controller;

import com.eats.models.User;

public interface UserController {

	User findByUserById(Long userId);

}
