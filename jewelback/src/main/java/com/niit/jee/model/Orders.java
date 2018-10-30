package com.niit.jee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Orders implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="O_ID")
	private int o_id;
	private User user;
	@Column(name="PAYMENT") int payment;
	@Column(name="ORDER_TOTAL") int orderTotal;
	
	/**
	 * @param o_id
	 * @param user
	 * @param payment
	 * @param orderTotal
	 */
	public Orders(int o_id, User user, int payment, int orderTotal) {
		super();
		this.o_id = o_id;
		this.user = user;
		this.payment = payment;
		this.orderTotal = orderTotal;
	}
	/**
	 * @return the o_id
	 */
	public int getO_id() {
		return o_id;
	}
	/**
	 * @param o_id the o_id to set
	 */
	public void setO_id(int o_id) {
		this.o_id = o_id;
	}
	/**
	 * @return the user
	 */
	@ManyToOne 	
	@JoinColumn(name="U_MAILID")
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the payment
	 */
	public int getPayment() {
		return payment;
	}
	/**
	 * @param payment the payment to set
	 */
	public void setPayment(int payment) {
		this.payment = payment;
	}
	/**
	 * @return the orderTotal
	 */
	public int getOrderTotal() {
		return orderTotal;
	}
	/**
	 * @param orderTotal the orderTotal to set
	 */
	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	

}
