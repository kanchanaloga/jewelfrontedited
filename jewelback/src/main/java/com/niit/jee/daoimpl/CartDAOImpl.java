package com.niit.jee.daoimpl;
/*
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.jee.dao.CartDAO;
import com.niit.jee.model.Cart;

@Repository
public class CartDAOImpl implements CartDAO {

	public void persist(Cart p) {
		// TODO Auto-generated method stub

	}

	public void update(Cart p) {
		// TODO Auto-generated method stub

	}

	public Cart findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Cart p) {
		// TODO Auto-generated method stub

	}

	public List<Cart> getAllCarts() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
*/

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.jee.dao.CartDAO;
import com.niit.jee.model.Cart;


@Repository
public class CartDAOImpl implements CartDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void save(Cart cart1)
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(cart1);
		s.getTransaction().commit();
		s.close();
		
	}

	public Cart getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	/*public List<Cart> getAll() {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	public List<Cart> getAll() 
	{
	Session s=sessionFactory.openSession();
	List<Cart> clist=s.createCriteria(Cart.class).list();
	s.clear();
	return clist;
	}
	public Cart findById(int id) 
	{
	return (Cart)sessionFactory.openSession().get(Cart.class,id);
	
	}

	
public void delete(Cart p)
{		Session s=sessionFactory.openSession() ;
		s.beginTransaction();

		s.delete(p);

		s.getTransaction().commit();

		s.close();




	}  
public List<Cart> checkExistance(int pid) 

{

    Session s=sessionFactory.openSession();		

    List<Cart> results =s.createQuery("from Cart where productid="+pid).list();		

	s.close();

	return results;

}









public void update(Cart p) 

{

	Session s=sessionFactory.openSession();

	s.beginTransaction();

	s.update(p);

	s.getTransaction().commit();

	s.close();









}



	      
		
}
