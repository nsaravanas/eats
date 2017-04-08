package com.eats.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class UserPreference {

	@ManyToOne
	private User user;

	@OneToMany
	private List<Item> favourites;

	@OneToMany
	private List<Item> pastOrders;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Item> getFavourites() {
		return favourites;
	}

	public void setFavourites(List<Item> favourites) {
		this.favourites = favourites;
	}

	public List<Item> getPastOrders() {
		return pastOrders;
	}

	public void setPastOrders(List<Item> pastOrders) {
		this.pastOrders = pastOrders;
	}

}
