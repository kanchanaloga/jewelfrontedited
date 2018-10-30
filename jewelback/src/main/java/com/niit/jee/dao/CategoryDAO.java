package com.niit.jee.dao;

import java.util.List;

import com.niit.jee.model.Category;


public interface CategoryDAO
{
	 public void persist(Category c);
		public void delete(Category c);
		public void update(Category c);
		
		public Category  findById(int id);
		
	
		
		public List<Category> getAllCategories();
		
		public Category getCategoryDetails(int id);
	//	public void deleteAll();
	

}
