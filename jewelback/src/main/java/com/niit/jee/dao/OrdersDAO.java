package com.niit.jee.dao;

import java.util.List;

import com.niit.jee.model.Orders;


public interface OrdersDAO 
{
	public void persist(Orders o);
	
	public void update(Orders o);
	
	public Orders  findById(int id);
	
	public void delete(Orders o);
	
	public List<Orders> getAllOrders();
	
	public void deleteAll();

}
