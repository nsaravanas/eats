package com.eats.models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.eats.models.enums.Status;

@Entity
public class Order {

	@Id
	private Long orderId;

	@ManyToOne
	private User user;

	@OneToMany
	private List<OrderItem> orderItems;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime orderedOn;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime updatedOn;

	@Enumerated(EnumType.STRING)
	private Status status;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime deliveryTime;

	@OneToOne
	private OrderPrice orderPrice;

	@OneToOne
	private Delivery delivery;

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public LocalDateTime getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(LocalDateTime deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public OrderPrice getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(OrderPrice orderPrice) {
		this.orderPrice = orderPrice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getOrderedOn() {
		return orderedOn;
	}

	public void setOrderedOn(LocalDateTime orderedOn) {
		this.orderedOn = orderedOn;
	}

	public LocalDateTime getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDateTime updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
