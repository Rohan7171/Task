package com.spring.spring.service;

import java.util.ArrayList;

import java.util.List;

import com.spring.spring.controller.entities.Charge;

public class ChargeServiceImpl implements ChargeService {

	
	List<Charge> list;
	public ChargeServiceImpl() {
		list=new ArrayList<>();
		list.add(new Charge(1,"Electronics","15%","18%",350));
		list.add(new Charge(2,"Home Appliances","22%","24%",800));

	}
	@Override
	public List<Charge> getCharges() {
		// TODO Auto-generated method stub
		return list;
	}

}
