package com.niit.ecommerce.com.demo.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")
public class Supplier {
	@Id
	private int supplier_id;
	
	@Column
	private String supplier_name;
	
	@Column
	private String supplier_address;

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public String getSupplier_name() {
		return supplier_name;
	}

	public void setSupplier_name(String supplier_name) {
		this.supplier_name = supplier_name;
	}

	public String getSupplier_address() {
		return supplier_address;
	}

	public void setSupplier_address(String supplier_address) {
		this.supplier_address = supplier_address;
	}
	
	

}
