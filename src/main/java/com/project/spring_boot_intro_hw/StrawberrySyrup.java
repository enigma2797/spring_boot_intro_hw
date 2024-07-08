package com.project.spring_boot_intro_hw;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake.syrup",havingValue = "strawberry")
public class StrawberrySyrup implements Syrup {

	@Override
	public String getSyrupType() {
		
		return "Strawberry Syrup";
	}
	

}
