package com.spring.spring.controller.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="CHARGE")
public class Charge {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cid")
	private long cid;
	
	@Column(name="category",nullable=false)
	private String category;
	
	@Column(name="discount",nullable=false)
	private String discount;
	
	@Column(name="gst",nullable=false)
	private String GST;
	
	@Column(name="delivery",nullable=false)
	private int Delivery;
	public Charge(long cid, String category, String discount, String gST, int delivery) {
		super();
		this.cid = cid;
		this.category = category;
		this.discount = discount;
		GST = gST;
		Delivery = delivery;
	}
	public Charge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getGST() {
		return GST;
	}
	public void setGST(String gST) {
		GST = gST;
	}
	public int getDelivery() {
		return Delivery;
	}
	public void setDelivery(int delivery) {
		Delivery = delivery;
	}
	@Override
	public String toString() {
		return "Charge [cid=" + cid + ", category=" + category + ", discount=" + discount + ", GST=" + GST
				+ ", Delivery=" + Delivery + "]";
	}
	

}
