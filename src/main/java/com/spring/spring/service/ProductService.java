package com.spring.spring.service;

import java.util.List;

import com.spring.spring.controller.entities.Product;

public interface ProductService {
	
	public List<Product> getProducts();
	
	public Product getProduct(long productid);
	
	public Product addProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public void deleteproduct(long parselong);
	
	
	

}
