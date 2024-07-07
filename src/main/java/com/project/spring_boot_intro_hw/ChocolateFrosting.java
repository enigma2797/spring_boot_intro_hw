package com.project.spring_boot_intro_hw;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ChocolateFrosting implements Frosting {

	@Override
	public String getFrostingType() {
		// TODO Auto-generated method stub
		return "Chocolate Frosting";
	}

}
