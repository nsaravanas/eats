package com.eats.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Menu {

	@Id
	private Long id;

	@ManyToOne
	private Restaurant hotel;

	@OneToMany
	private List<Item> items;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Restaurant getHotel() {
		return hotel;
	}

	public void setHotel(Restaurant hotel) {
		this.hotel = hotel;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}
