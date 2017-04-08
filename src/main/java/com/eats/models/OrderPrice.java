package com.eats.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderPrice {

	@Id
	private Long id;

	@OneToOne
	private Order order;

	@Column
	private Double totalAmount;

	@Column
	private Double amountPaid;

	@Enumerated(EnumType.STRING)
	private ModeOfPay modeOfPay;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(Double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public ModeOfPay getModeOfPay() {
		return modeOfPay;
	}

	public void setModeOfPay(ModeOfPay modeOfPay) {
		this.modeOfPay = modeOfPay;
	}

}
