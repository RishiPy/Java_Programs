package com.niit.ecommerce.com.demo.backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.niit.ecommerce.com.demo.backend.entity.Product;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	@PersistenceContext
	EntityManager manager;

	@Override
	public Product getProductById(int id) {
		Product product=manager.find(Product.class, id);
		return product;
	}

	@Override
	public void saveProduct(Product product) {
		manager.persist(product);
	}
	

}
