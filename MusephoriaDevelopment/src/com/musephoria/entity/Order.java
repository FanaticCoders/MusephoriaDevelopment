package com.musephoria.entity;
// default package

// Generated Oct 24, 2015 10:30:11 PM by Hibernate Tools 4.0.0.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "order", catalog = "musephoria", uniqueConstraints = @UniqueConstraint(columnNames = "CustomerId") )
@SuppressWarnings("serial")
public class Order implements java.io.Serializable {

	private Integer orderId;
	private Date timeStamp;
	private Customer customer;
	private Float baseAmount;
	private Float tax;
	private float totalAmount;
	private Boolean indiacator;
	private Set<Orderitem> orderitems = new HashSet<Orderitem>(0);
	private Set<Shipping> shippings = new HashSet<Shipping>(0);

	public Order() {
	}

	public Order(Customer customer, float totalAmount) {
		this.customer = customer;
		this.totalAmount = totalAmount;
	}

	public Order(Customer customer, Float baseAmount, Float tax, float totalAmount, Boolean indiacator,
			Set<Orderitem> orderitems, Set<Shipping> shippings) {
		this.customer = customer;
		this.baseAmount = baseAmount;
		this.tax = tax;
		this.totalAmount = totalAmount;
		this.indiacator = indiacator;
		this.orderitems = orderitems;
		this.shippings = shippings;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "OrderId", unique = true, nullable = false)
	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Version
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TimeStamp", nullable = false, length = 19)
	public Date getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CustomerId", unique = true, nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "BaseAmount", precision = 12, scale = 0)
	public Float getBaseAmount() {
		return this.baseAmount;
	}

	public void setBaseAmount(Float baseAmount) {
		this.baseAmount = baseAmount;
	}

	@Column(name = "Tax", precision = 12, scale = 0)
	public Float getTax() {
		return this.tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	@Column(name = "TotalAmount", nullable = false, precision = 12, scale = 0)
	public float getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Column(name = "Indiacator")
	public Boolean getIndiacator() {
		return this.indiacator;
	}

	public void setIndiacator(Boolean indiacator) {
		this.indiacator = indiacator;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public Set<Orderitem> getOrderitems() {
		return this.orderitems;
	}

	public void setOrderitems(Set<Orderitem> orderitems) {
		this.orderitems = orderitems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public Set<Shipping> getShippings() {
		return this.shippings;
	}

	public void setShippings(Set<Shipping> shippings) {
		this.shippings = shippings;
	}

}
