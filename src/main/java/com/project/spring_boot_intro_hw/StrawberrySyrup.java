package com.project.spring_boot_intro_hw;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class StrawberrySyrup implements Syrup {

	@Override
	public String getSyrupType() {
		// TODO Auto-generated method stub
		return "Strawberry Syrup";
	}
	

}
