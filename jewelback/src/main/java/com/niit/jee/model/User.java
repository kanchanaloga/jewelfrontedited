package com.niit.jee.model;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	
	@Column(name="U_MAILID")
	private String u_mail;
	@Column(name="U_NAME")
    private String u_name;
	@Column(name="U_PASSWORD")
	private String u_password;
	@Column(name="ENABLED")
	private boolean enabled;
public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	/*	@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="CART_ID")*/
	@Column(name="CART_ID")
	private Cart cart;
	@OneToMany(targetEntity=Orders.class,mappedBy = "user", cascade = CascadeType.ALL)
	private Set<Orders> orders;
	
	@Column(name="U_ADD")
    private String u_add;
	
	@Column(name="U_AGE")
    private int u_age;
	
	@Column(name="U_PHONE")
    private long u_phone;
	
	@Column(name="U_role")
    private String u_role;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getU_add() {
		return u_add;
	}
	public void setU_add(String u_add) {
		this.u_add = u_add;
	}
	public int getU_age() {
		return u_age;
	}
	public void setU_age(int u_age) {
		this.u_age = u_age;
	}
	
	public long getU_phone() {
		return u_phone;
	}
	public void setU_phone(long u_phone) {
		this.u_phone = u_phone;
	}
	public String getU_role() {
		return u_role;
	}
	public void setU_role(String u_role) {
		this.u_role = u_role;
	}
	/**
	 * @param u_mail
	 * @param u_name
	 * @param u_password
	 * @param cart_id
	 * @param orders
	 * @param role
	 */
	public User(String u_mail, String u_name, String u_password, Cart cart, Set<Orders> orders, String u_role) {
		super();
		this.u_mail = u_mail;
		this.u_name = u_name;
		this.u_password = u_password;
		this.cart = cart;
		this.orders = orders;
		this.u_role=u_role;
		
	}
	/**
	 * @return the u_mail
	 */
	
	public String getU_mail() {
		return u_mail;
	}
	/**
	 * @param u_mail the u_mail to set
	 */
	public void setU_mail(String u_mail) {
		this.u_mail = u_mail;
	}
	/**
	 * @return the u_name
	 */
	
	public String getU_name() {
		return u_name;
	}
	/**
	 * @param u_name the u_name to set
	 */
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	/**
	 * @return the u_password
	 */
	
	public String getU_password() {
		return u_password;
	}
	/**
	 * @param u_password the u_password to set
	 */
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	/**
	 * @return the cart_id
	 */
	
	public Cart getCart_id() {
		return cart;
	}
	/**
	 * @param cart_id the cart_id to set
	 */
	public void setCart_id(Cart cart) {
		this.cart = cart;
	}
	/**
	 * @return the orders
	 */
	
	public Set<Orders> getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	/**
	 * @return the role
	 */
	
	
	

}
