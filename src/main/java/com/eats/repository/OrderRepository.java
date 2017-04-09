package com.eats.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eats.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	List<Order> findOrderByUserId(Long userId);

}
