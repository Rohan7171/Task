package com.spring.spring.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring.controller.entities.Charge;
import com.spring.spring.service.ChargeService;
@RestController
public class MycontrollerCharges {
    
	public ChargeService chargeservice;
	
	@GetMapping("/charges")
	public List<Charge> getCharges()
	{
		return this.chargeservice.getCharges();
		
			
		}
}
