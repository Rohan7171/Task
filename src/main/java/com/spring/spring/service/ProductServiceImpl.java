package com.spring.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring.spring.controller.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	List<Product> list;
	
	public ProductServiceImpl() {
		list=new ArrayList<>();
		list.add(new Product(1001,"Lenovo Yoga","Laptop","Electronics",45000));
		list.add(new Product(1002,"LG Washing Machine","Washing Machine","Home Appliances",25000));
		list.add(new Product(1003,"HPPavilion 360","Laptop","Electronics",36000));
		list.add(new Product(1004,"US Polo Assn","T-Shirt","Clothing",1200));
		list.add(new Product(1005,"NeelKamal bean bag","Sofa Set","Furniture",350));

	}
	
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Product getProduct(long productid) {
      Product p=null;
      for(Product product:list)
      {
    	  p=product;
    	  break;
      }

      
      return p;
	}


	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		list.add(product);
		return product;
	}


	@Override
	public Product updateProduct(Product product) {

		list.forEach(e -> {
			if(e.getPid() == product.getPid()) {
				e.setPname(product.getPname());
				e.setPcategory(product.getPcategory());
				e.setPprice(product.getPprice());
				e.setPtype(product.getPtype());
			}
		});
		return product;
	}


	@Override
	public void deleteproduct(long parselong) {
		
		list=this.list.stream().filter(e ->e.getPid()!=parselong).collect(Collectors.toList());
		
	}

}
