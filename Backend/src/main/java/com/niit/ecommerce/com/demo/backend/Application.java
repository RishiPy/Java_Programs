package com.niit.ecommerce.com.demo.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.niit.ecommerce.com.demo.backend.dao.ProductDaoImpl;
import com.niit.ecommerce.com.demo.backend.dao.SupplierDaoImpl;
import com.niit.ecommerce.com.demo.backend.entity.Product;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	ProductDaoImpl pdao;

	@Autowired
	SupplierDaoImpl sdao;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("************ PRODUCT ************");
		System.out.println("NAME - " + pdao.getProductById(1).getProd_name() + " |  PRICE - "
				+ pdao.getProductById(1).getProd_price());
		System.out.println("************ SUPPLIER ************");
		System.out.println("Name :- "+sdao.getSupplierById(1).getSupplier_name()+" |  Address :- "+sdao.getSupplierById(1).getSupplier_address());
	Product pro = new Product();
	pro.setProd_id(121);
	pro.setProd_name("Play");
	pro.setProd_price(1500);
	pdao.saveProduct(pro);
	
	}
}
