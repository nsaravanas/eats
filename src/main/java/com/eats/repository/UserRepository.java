package com.eats.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eats.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
