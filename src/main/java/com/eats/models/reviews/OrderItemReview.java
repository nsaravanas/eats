package com.eats.models.reviews;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.eats.models.OrderItem;
import com.eats.models.User;
import com.eats.models.audit.AuditInfo;

@Entity
@Audited
@EntityListeners(AuditingEntityListener.class)
public class OrderItemReview extends AuditInfo {

	@Id
	private Long id;

	@ManyToOne
	private User user;

	@ManyToOne
	private OrderItem orderItem;

	@Column
	private String review;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
}
