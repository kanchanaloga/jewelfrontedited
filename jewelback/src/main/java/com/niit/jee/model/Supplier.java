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
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SUPPLIER")
public class Supplier implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="S_ID")
    private int s_id;
	@Column(name="S_NAME") 
	private String s_name;
	
	@OneToMany(targetEntity=Product.class,mappedBy="supplier",cascade = CascadeType.ALL)
	private Set<Product> product;
/**
 * @param s_id
 * @param s_name
 * @param products
 */
	
public Supplier(int s_id, String s_name, Set<Product> product) {
	super();
	this.s_id = s_id;
	this.s_name = s_name;
	this.product = product;
}
public Supplier() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @return the s_id
 */

public int getS_id() {
	return s_id;
}
/**
 * @param s_id the s_id to set
 */
public void setS_id(int s_id) {
	this.s_id = s_id;
}
/**
 * @return the s_name
 */
public String getS_name() {
	return s_name;
}
/**
 * @param s_name the s_name to set
 */
public void setS_name(String s_name) {
	this.s_name = s_name;
}
/**
 * @return the products
 */
public Set<Product> getProduct() {
	return product;
}
/**
 * @param products the products to set
 */

public void setProduct(Set<Product> product) {
	this.product = product;
}
@Override
public String toString() {
	return "Supplier [s_id=" + s_id + ", s_name=" + s_name + ", product=" + product + "]";
}
  
  
}
