package com.niit.ecommerce.com.demo.backend.dao;

import com.niit.ecommerce.com.demo.backend.entity.Product;

public interface ProductDao {
	public abstract Product getProductById(int id);
	public abstract void saveProduct(Product product);

}
