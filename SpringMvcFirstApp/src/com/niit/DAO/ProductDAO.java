package com.niit.DAO;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO {
public List<Product> getProductList();
public void save(Product p);
public void updateProduct(Product pro);
public void deleteProduct(int pro);
public Product getProductById(int id);

}
