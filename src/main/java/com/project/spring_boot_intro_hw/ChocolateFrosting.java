package com.project.spring_boot_intro_hw;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="cake.frosting",havingValue = "chocolate")
public class ChocolateFrosting implements Frosting {

	@Override
	public String getFrostingType() {
		
		return "Chocolate Frosting";
	}

}
