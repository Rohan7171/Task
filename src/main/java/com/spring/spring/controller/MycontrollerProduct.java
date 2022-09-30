package com.spring.spring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring.controller.entities.Product;
import com.spring.spring.service.ProductService;


@RestController
public class MycontrollerProduct {
	@Autowired
	public ProductService productservice;
	
	@GetMapping("/product")
	public String Products() {
		return"this is product";
	}	
	@GetMapping("/products")
	public List<Product> getProducts()
	{
		return this.productservice.getProducts();
			
		}
	@GetMapping("/product/{productid}")
	public Product getProducts(@PathVariable String productid)
	{
		return this.productservice.getProduct(Long.parseLong(productid));
	}
	@PostMapping("/products")
	public Product addproduct(@RequestBody Product product) {
		return this.productservice.addProduct(product);
		
	}
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product product) {
		return this.productservice.updateProduct(product);
	}
	
	@DeleteMapping("/product/{productid}")
	public ResponseEntity<HttpStatus> deleteproduct(@PathVariable String productid){
		try {
			this.productservice.deleteproduct(Long.parseLong(productid));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		}
	}
	