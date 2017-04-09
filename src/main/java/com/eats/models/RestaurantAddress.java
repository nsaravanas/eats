package com.eats.models;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.eats.models.audit.AuditInfo;

@Entity
@Audited
@EntityListeners(AuditingEntityListener.class)
public class RestaurantAddress extends AuditInfo {

	@Id
	private Long restaurantAddressId;

	@ManyToOne
	private Restaurant restaurant;

	@Embedded
	private Address address;

	public Long getRestaurantAddressId() {
		return restaurantAddressId;
	}

	public void setRestaurantAddressId(Long restaurantAddressId) {
		this.restaurantAddressId = restaurantAddressId;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
