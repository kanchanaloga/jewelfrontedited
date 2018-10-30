

package com.niit.jee.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;




/*package com.niit.jee.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cart implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CART_ID")
	int cart_id;
    private Supplier supplier;
	private Product product;
	@Column(name="C_PRICE")
    private int c_price;
	@Column(name="C_QUANTITY")
    private int c_quantity;
	@Column(name="C_STATUS")
	private int c_status;
	
	
	*//**
	 * @param cart_id
	 * @param supplier
	 * @param user
	 * @param product
	 * @param c_price
	 * @param c_quantity
	 * @param c_status
	 *//*
	public Cart(int cart_id, Supplier supplier, Product product, int c_price, int c_quantity, int c_status) {
		super();
		this.cart_id = cart_id;
		this.supplier = supplier;
		this.product = product;
		this.c_price = c_price;
		this.c_quantity = c_quantity;
		this.c_status = c_status;
	}
	*//**
	 * @return the cart_id
	 *//*
	
	public int getCart_id() {
		return cart_id;
	}
	*//**
	 * @param cart_id the cart_id to set
	 *//*
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	*//**
	 * @return the supplier
	 *//*
	@ManyToOne
    @JoinColumn(name="S_ID")
	public Supplier getSupplier() {
		return supplier;
	}
	*//**
	 * @param supplier the supplier to set
	 *//*
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	*//**
	 * @return the user
	 *//*
	
	*//**
	 * @return the c_price
	 *//*
	public int getC_price() {
		return c_price;
	}
	*//**
	 * @param c_price the c_price to set
	 *//*
	public void setC_price(int c_price) {
		this.c_price = c_price;
	}
	*//**
	 * @return the c_quantity
	 *//*
	public int getC_quantity() {
		return c_quantity;
	}
	*//**
	 * @param c_quantity the c_quantity to set
	 *//*
	public void setC_quantity(int c_quantity) {
		this.c_quantity = c_quantity;
	}
	*//**
	 * @return the c_status
	 *//*
	public int getC_status() {
		return c_status;
	}
	*//**
	 * @param c_status the c_status to set
	 *//*
	public void setC_status(int c_status) {
		this.c_status = c_status;
	}
	*//**
	 * @return the product
	 *//*
	@ManyToOne
    @JoinColumn(name="P_ID")
	public Product getProduct() {
		return product;
	}
	*//**
	 * @param product the product to set
	 *//*
	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	

}
*/
@Entity
@Table(name="CART")
public class Cart implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Id
     private int cartid;
	//private int suplierid;
	//private int productid;
	//private int userid;
	private Product productid;
	private Supplier suplierid;
	private User userid;
	
	private int prices;
	private int quantity;
	private String status;
	
	@Id
	@GeneratedValue
	@Column(name="cartid")//defining the database column
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	//In One productid display in cart
		@OneToOne
		@JoinColumn(name="P_ID")
		public Product getProductid() {
			return productid;
		}
		public void setProductid(Product productid) {
			this.productid = productid;
		}
		/*@OneToOne
		@JoinColumn(name="suplierid")
		public SupplierModel getSuplierid() {
			return suplierid;
		}
		public void setSuplierid(SupplierModel suplierid) {
			this.suplierid = suplierid;
		}*/
		/*@OneToOne
		@JoinColumn(name="userid")
		public UserModel getUserid() {
			return userid;
		}
		public void setUserid(UserModel userid) {
			this.userid = userid;
		}*/
	@Column(name="prices")
	public int getPrices() {
		return prices;
	}
	public void setPrices(int prices) {
		this.prices = prices;
	}
	@Column(name="quantity")
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/*@Column(name="status")
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}*/
	
	

}
