package com.musephoria.entity;
// default package
// Generated Oct 25, 2015 10:59:42 PM by Hibernate Tools 4.0.0.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Session generated by hbm2java
 */
@Entity
@Table(name = "session", catalog = "musephoria")
@SuppressWarnings("serial")
public class Session implements java.io.Serializable {

	private Integer sessionId;
	private Customer customer;
	private String ipAddress;
	private String userAgent;
	private Date sessionStartTime;
	private Date sessionEndTime;
	private boolean isSessionActive;

	public Session() {
	}

	public Session(Customer customer, Date sessionStartTime, Date sessionEndTime, boolean isSessionActive) {
		this.customer = customer;
		this.sessionStartTime = sessionStartTime;
		this.sessionEndTime = sessionEndTime;
		this.isSessionActive = isSessionActive;
	}

	public Session(Customer customer, String ipAddress, String userAgent, Date sessionStartTime, Date sessionEndTime,
			boolean isSessionActive) {
		this.customer = customer;
		this.ipAddress = ipAddress;
		this.userAgent = userAgent;
		this.sessionStartTime = sessionStartTime;
		this.sessionEndTime = sessionEndTime;
		this.isSessionActive = isSessionActive;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "SessionId", unique = true, nullable = false)
	public Integer getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CustomerId", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "IpAddress", length = 25)
	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Column(name = "UserAgent", length = 25)
	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SessionStartTime", nullable = false, length = 19)
	public Date getSessionStartTime() {
		return this.sessionStartTime;
	}

	public void setSessionStartTime(Date sessionStartTime) {
		this.sessionStartTime = sessionStartTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SessionEndTime", nullable = false, length = 19)
	public Date getSessionEndTime() {
		return this.sessionEndTime;
	}

	public void setSessionEndTime(Date sessionEndTime) {
		this.sessionEndTime = sessionEndTime;
	}

	@Column(name = "IsSessionActive", nullable = false)
	public boolean isIsSessionActive() {
		return this.isSessionActive;
	}

	public void setIsSessionActive(boolean isSessionActive) {
		this.isSessionActive = isSessionActive;
	}

}
