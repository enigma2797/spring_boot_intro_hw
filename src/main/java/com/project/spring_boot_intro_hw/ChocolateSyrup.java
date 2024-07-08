package com.project.spring_boot_intro_hw;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake.syrup",havingValue = "chocolate")
public class ChocolateSyrup implements Syrup{

	@Override
	public String getSyrupType() {
		// TODO Auto-generated method stub
		return "Chocolate Syrup";
	}

	
}
