package com.niit.jee.dao;

import java.util.List;

import com.niit.jee.model.Product;

public interface ProductDAO 
{
    public void persist(Product p);
	
	public void update(Product p);
	
	public Product  findById(int id);
	
	public void delete(Product p);
	
	public List<Product> getProducts();
	
	public void deleteAll();
	



public List<Product> getFilterProducts(int cid);
	
	/* newly added methods */
   
/*public Product getCategoryDetail(String id);

	

public	void updateCategoryDetail(Product obj);
*/
	
     
}
