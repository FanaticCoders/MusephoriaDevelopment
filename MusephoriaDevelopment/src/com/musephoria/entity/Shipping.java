package com.musephoria.entity;
// Generated Oct 19, 2015 11:46:19 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Shipping generated by hbm2java
 */
@Entity
@Table(name = "shipping", catalog = "musephoria", uniqueConstraints = @UniqueConstraint(columnNames = "OrderId") )
@SuppressWarnings("serial")
public class Shipping implements java.io.Serializable {

	private Integer shippingId;
	private Order order;
	private String address;
	private String status;
	private Boolean indicator;

	public Shipping() {
	}

	public Shipping(Order order, String address, String status) {
		this.order = order;
		this.address = address;
		this.status = status;
	}

	public Shipping(Order order, String address, String status, Boolean indicator) {
		this.order = order;
		this.address = address;
		this.status = status;
		this.indicator = indicator;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ShippingId", unique = true, nullable = false)
	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OrderId", unique = true, nullable = false)
	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Column(name = "Address", nullable = false, length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "Status", nullable = false, length = 9)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "Indicator")
	public Boolean getIndicator() {
		return this.indicator;
	}

	public void setIndicator(Boolean indicator) {
		this.indicator = indicator;
	}

}
