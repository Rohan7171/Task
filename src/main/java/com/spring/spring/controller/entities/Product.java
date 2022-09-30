package com.spring.spring.controller.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long pid;
	
	@Column(name="name",nullable=false)
	private String pname;
	
	@Column(name="ptype",nullable=false)
	private String ptype;
	
	@Column(name="pcategory",nullable=false)
	private String pcategory;
	
	@Column(name="price",nullable=false)
	private int pprice;
	
	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", ptype=" + ptype + ", pcategory=" + pcategory
				+ ", pprice=" + pprice + "]";
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(long pid, String pname, String ptype, String pcategory, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ptype = ptype;
		this.pcategory = pcategory;
		this.pprice = pprice;
	}

}
