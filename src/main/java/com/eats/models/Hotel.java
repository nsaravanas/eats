package com.eats.models;

import java.util.List;

public class Hotel {

	private Long hotelId;

	private String name;

	private List<Address> branches;

	private List<Menu> menu;

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getBranches() {
		return branches;
	}

	public void setBranches(List<Address> branches) {
		this.branches = branches;
	}

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

}
