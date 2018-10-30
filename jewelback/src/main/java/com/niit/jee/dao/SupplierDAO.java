package com.niit.jee.dao;

import java.util.List;

import com.niit.jee.model.Supplier;


public interface SupplierDAO 
{
public void persist(Supplier u);
	
	public void update(Supplier u);
	
	public Supplier findById(int id);
	
	public void delete(Supplier u);
	
	public List<Supplier> getAllUsers();
	
	public Supplier getSupplierDetails(int id);
	public void deleteAll();

}
