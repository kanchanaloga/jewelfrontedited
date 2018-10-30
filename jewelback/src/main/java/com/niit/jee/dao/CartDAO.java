package com.niit.jee.dao;

import java.util.List;

/*import com.niit.jee.daoimpl;*/
import com.niit.jee.model.*;

public interface CartDAO  
{

	

	 //save
	public void save(Cart cart);
    //read
		public Cart getId(int id);
		//update
		public void update(Cart cart);
		//deleted
		public void deleteById(int id);
		//Get All
		public List<Cart> getAll();
		public Cart findById(int id);
		public void delete(Cart p);
		public List<Cart> checkExistance(int pid);


}


