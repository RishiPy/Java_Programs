package com.niit.daoimpl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Repository
public class ProductImpl implements ProductDao {
	
	@Autowired
	SessionFactory sessionFactory;
	public void saveProduct(Product p) {
		
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		ssn.save(p);
		t.commit();
		ssn.close();
		
	}
	public List<Product> getProductList() {
		Session ssn=sessionFactory.openSession();
		ssn.beginTransaction();
		
		List<Product> list=ssn.createQuery("from Product").list();
		ssn.getTransaction().commit();
		return list;
	}
	
	
	public void deleteProduct(int pid) {
		
		// TODO Auto-generated method stub
		Session sess=sessionFactory.openSession();
	    sess.beginTransaction();
	    Product pro=(Product)sess.load(Product.class,pid);
	   sess.delete(pro);
	    sess.getTransaction().commit();
	
		
	}
	public void editProduct(Product pid) {
		Session sess=sessionFactory.openSession();
	    sess.beginTransaction();	   
	    sess.saveOrUpdate(pid);
		
		sess.getTransaction().commit();
		
		
	}
	public Product getProductById(int pid) {
		Session sess=sessionFactory.openSession();
		sess.beginTransaction();
		 Product pro=(Product)sess.load(Product.class,pid);
		sess.getTransaction().commit();
		return pro;
	}

	
	
	
}
