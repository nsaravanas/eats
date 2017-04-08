package com.eats.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class OrderItem {

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
