package com.project.spring_boot_intro_hw;

import org.springframework.stereotype.Component;

@Component
public class ChocolateSyrup implements Syrup{

	@Override
	public String getSyrupType() {
		// TODO Auto-generated method stub
		return "Chocolate Syrup";
	}

	
}
