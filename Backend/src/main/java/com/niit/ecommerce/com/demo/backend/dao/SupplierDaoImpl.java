package com.niit.ecommerce.com.demo.backend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.niit.ecommerce.com.demo.backend.entity.Supplier;

@Repository
@Transactional

public class SupplierDaoImpl implements SupplierDao{
	@PersistenceContext
	EntityManager manager;

	@Override
	public Supplier getSupplierById(int id) {
		Supplier supplier=manager.find(Supplier.class, id);
		return supplier;
	}

	@Override
	public void saveSupplierDetails(Supplier supplier) {
		manager.persist(supplier);
		
	}
	
	

}
