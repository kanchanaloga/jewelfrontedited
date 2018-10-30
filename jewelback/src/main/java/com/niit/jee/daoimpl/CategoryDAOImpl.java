package com.niit.jee.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.jee.dao.CategoryDAO;
import com.niit.jee.model.Category;
import com.niit.jee.model.Supplier;

@Repository
public class CategoryDAOImpl implements CategoryDAO
{
    @Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	public void persist(Category c) 
	{
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(c);
		s.getTransaction().commit();
		s.close();
		// TODO Auto-generated method stub
		
	}

	public void update(Category c) {
		// TODO Auto-generated method stub
		
	}

	public Category findById(int id) 
	{
		return (Category)sessionFactory.openSession().get(Category.class, id);
	}

	public void delete(Category c) {
		// TODO Auto-generated method stub
		
	}

	public List<Category> getAllCategories() {
		Session sf =sessionFactory.openSession();
		sf.beginTransaction();
		Query query = sf.createQuery("from Category");
		List<Category> list1=query.list();
		System.out.println(list1);
		sf.getTransaction().commit();
		return list1;

	}
	
	public Category getCategoryDetails(int id){
	
		Category c=(Category)sessionFactory.openSession().get(Category.class,id );
		
		return c;
	}

	public void deleteAll() {
		
	}

}
