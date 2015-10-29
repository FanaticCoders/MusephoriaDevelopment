package com.musephoria.entity;
// default package
// Generated Oct 29, 2015 12:25:05 AM by Hibernate Tools 4.0.0.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Purchaseorder generated by hbm2java
 */
@Entity
@Table(name = "purchaseorder", catalog = "musephoria")
@SuppressWarnings("serial")
public class Purchaseorder implements java.io.Serializable {

	private Integer purchaseOrderId;
	private Customer customer;
	private int totalQuantity;
	private float totalPrice;
	private float taxes;
	private String purchaseOrderStatus;

	public Purchaseorder() {
	}

	public Purchaseorder(Customer customer, int totalQuantity, float totalPrice, float taxes,
			String purchaseOrderStatus) {
		this.customer = customer;
		this.totalQuantity = totalQuantity;
		this.totalPrice = totalPrice;
		this.taxes = taxes;
		this.purchaseOrderStatus = purchaseOrderStatus;
	}

	public Purchaseorder(Customer customer, int totalQuantity, float totalPrice, float taxes,
			String purchaseOrderStatus, Set<Purchaseorderitem> purchaseorderitems, Set<Shipping> shippings) {
		this.customer = customer;
		this.totalQuantity = totalQuantity;
		this.totalPrice = totalPrice;
		this.taxes = taxes;
		this.purchaseOrderStatus = purchaseOrderStatus;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "PurchaseOrderId", unique = true, nullable = false)
	public Integer getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public void setPurchaseOrderId(Integer purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CustomerId", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "TotalQuantity", nullable = false)
	public int getTotalQuantity() {
		return this.totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	@Column(name = "TotalPrice", nullable = false, precision = 12, scale = 0)
	public float getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Column(name = "Taxes", nullable = false, precision = 12, scale = 0)
	public float getTaxes() {
		return this.taxes;
	}

	public void setTaxes(float taxes) {
		this.taxes = taxes;
	}

	@Column(name = "PurchaseOrderStatus", nullable = false, length = 8)
	public String getPurchaseOrderStatus() {
		return this.purchaseOrderStatus;
	}

	public void setPurchaseOrderStatus(String purchaseOrderStatus) {
		this.purchaseOrderStatus = purchaseOrderStatus;
	}
}
