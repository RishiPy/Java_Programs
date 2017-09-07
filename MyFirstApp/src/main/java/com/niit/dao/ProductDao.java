package com.niit.dao;

import java.util.List;

import com.niit.model.Product;

public interface ProductDao {

	public void saveProduct(Product p);
	public List<Product> getProductList();
	public void deleteProduct(int pid);
	public void editProduct(Product pid);
	public Product getProductById(int pid);
}
