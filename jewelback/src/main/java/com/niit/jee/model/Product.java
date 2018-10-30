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
@Table(name="PRODUCT")
public class Product implements Serializable
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="P_ID")
	int p_id;
	
	private String p_brand;
	private String p_name;
	private String p_description;
	private int p_price;
	private int p_quantity;
	@ManyToOne
    @JoinColumn(name="CATEGORY_ID")
    private Category category;
	
	@ManyToOne
    @JoinColumn(name="S_ID")
    private Supplier supplier;
	   @Column(name="P_IMAGE")
	private String p_image;
	/**
	 * @return the p_id
	 */
	
	public int getP_id() {
		return p_id;
	}
	/**
	 * @param p_id the p_id to set
	 */
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	/**
	 * @return the p_brand
	 */
	@Column(name="P_BRAND") 
	public String getP_brand() {
		return p_brand;
	}
	/**
	 * @param p_brand the p_brand to set
	 */
	public void setP_brand(String p_brand) {
		this.p_brand = p_brand;
	}
	/**
	 * @return the p_name
	 */
	@Column(name="P_NAME") 
	public String getP_name() {
		return p_name;
	}
	/**
	 * @param p_name the p_name to set
	 */
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	/**
	 * @return the p_description
	 */
	@Column(name="P_DESC") 
	public String getP_description() {
		return p_description;
	}
	/**
	 * @param p_description the p_description to set
	 */
	public void setP_description(String p_description) {
		this.p_description = p_description;
	}
	/**
	 * @return the p_price
	 */
	@Column(name="P_PRICE") 
	public int getP_price() {
		return p_price;
	}
	/**
	 * @param p_price the p_price to set
	 */
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	/**
	 * @return the p_quantity
	 */
	@Column(name="P_QUANTITY") 
	public int getP_quantity() {
		return p_quantity;
	}
	/**
	 * @param p_quantity the p_quantity to set
	 */
	public void setP_quantity(int p_quantity) {
		this.p_quantity = p_quantity;
	}
	/**
	 * @return the category
	 */
	/*@ManyToOne
    @JoinColumn(name="CATEGORY_ID")*/
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	/**
	 * @return the s_id
	 */
/*	@ManyToOne
    @JoinColumn(name="S_ID")*/
	public Supplier getSupplier() {
		return supplier;
	}
	/**
	 * @param s_id the s_id to set
	 */
	
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	/**
	 * @return the p_image
	 */
	public String getP_image() {
		return p_image;
	}
	/**
	 * @param p_image the p_image to set
	 */
	public void setP_image(String p_image) {
		this.p_image = p_image;
	}
	
	
			
}
