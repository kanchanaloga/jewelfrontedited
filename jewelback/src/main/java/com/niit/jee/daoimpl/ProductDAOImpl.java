package com.niit.jee.daoimpl;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.jee.dao.ProductDAO;
import com.niit.jee.model.Category;
import com.niit.jee.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}


	public void persist(Product p) 
	{	
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(p);
		s.getTransaction().commit();
		s.close();
		
	}  

	public void update(Product p) {
		Session s= sessionFactory.openSession();
		s.beginTransaction();
		s.update(p);
		s.getTransaction().commit();
		s.close();
		
	}

	public Product findById(int id) {
		return (Product)sessionFactory.openSession().get(Product.class, id);
	}

	 public void delete(Product p) {
	        // TODO Auto-generated method stub
	        Session s=sessionFactory.openSession();
	        s.beginTransaction();
	        s.delete(p);
	        
	        s.getTransaction().commit();
	        s.close();
	        sessionFactory.openSession().delete(p);
	    }

/*	public List<Product> getProducts() {
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		List<Product> list=s.createCriteria(Product.class).list();
		s.getTransaction().commit();
		return list;
	}
	*/
	 public List<Product> getProducts() {
	        
	        Session sf =sessionFactory.openSession();
	        sf.beginTransaction();
	        Query query = sf.createQuery("from Product");
	        List<Product> list2=query.list();
	        System.out.println(list2);
	    
	        sf.getTransaction().commit();
	            return list2;
	        }


	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	
	public List<Product> getFilterProducts(int cid)

	{
		System.out.println("first");

		Session s=sessionFactory.openSession() ;
		System.out.println("second");

		
		
		List<Product> results =s.createQuery("from Product where category_id="+cid).list();
		
		
        System.out.println("in product dAO");
		
		s.close();

		// TODO Auto-generated method stub

		return results;

	}

}