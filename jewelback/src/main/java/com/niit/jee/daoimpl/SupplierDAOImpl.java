package com.niit.jee.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.jee.dao.SupplierDAO;
import com.niit.jee.model.Category;
import com.niit.jee.model.Supplier;

@Repository
public class SupplierDAOImpl implements SupplierDAO {
	 @Autowired
		private SessionFactory sessionFactory;
		
		public void setSessionFactory(SessionFactory sf){
			this.sessionFactory = sf;
		}

		public void persist(Supplier su) 
		{
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			s.save(su);
			s.getTransaction().commit();
			s.close();
			// TODO Auto-generated method stub
			
		}

	public void update(Supplier u) {
		// TODO Auto-generated method stub

	}
	
	public Supplier getSupplierDetails(int id)
	{
		Supplier s=(Supplier)sessionFactory.openSession().get(Supplier.class,id);
		return s;
	}

	public Supplier findById(int id) {
		// TODO Auto-generated method stub
		return (Supplier)sessionFactory.openSession().get(Supplier.class, id);
	}

	public void delete(Supplier u) {
		// TODO Auto-generated method stub

	}

	public List<Supplier> getAllUsers() {
		Session sf =sessionFactory.openSession();
		sf.beginTransaction();
	    List<Supplier> list1=sf.createCriteria(Supplier.class).list();
		sf.getTransaction().commit();
		return list1;

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
