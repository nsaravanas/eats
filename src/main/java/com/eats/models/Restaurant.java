package com.eats.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.eats.models.audit.AuditInfo;

@Entity
@Audited
@EntityListeners(AuditingEntityListener.class)
public class Restaurant extends AuditInfo {

	@Id
	private Long restaurantId;

	@Column
	private String name;

	@OneToMany(mappedBy = "restaurant")
	private List<RestaurantAddress> branches;

	@OneToMany(mappedBy = "restaurant")
	private List<Menu> menu;

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RestaurantAddress> getBranches() {
		return branches;
	}

	public void setBranches(List<RestaurantAddress> branches) {
		this.branches = branches;
	}

	public List<Menu> getMenu() {
		return menu;
	}

	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}

}
