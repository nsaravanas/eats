package com.eats.models;

import javax.persistence.Column;
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
public class OrderItem extends AuditInfo {

	@Id
	private Long id;

	@ManyToOne
	private Order order;

	@ManyToOne
	private Item item;

	@Column
	private int quantity;

	@Column
	private double price;

}
