package com.niit.ecommerce.com.demo.backend.dao;

import com.niit.ecommerce.com.demo.backend.entity.Supplier;

public interface SupplierDao {
	public abstract Supplier getSupplierById(int id);
	public abstract void saveSupplierDetails(Supplier supplier);
	

}
