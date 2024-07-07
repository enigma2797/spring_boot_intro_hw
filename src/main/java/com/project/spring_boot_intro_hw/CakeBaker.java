package com.project.spring_boot_intro_hw;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
	
	Frosting f;
	Syrup s;
	
	
	public CakeBaker(Frosting f, Syrup s) {
		super();
		this.f = f;
		this.s = s;
	}


	public void bakeCake()
	{
		System.out.println("Cake baked with: "+ f.getFrostingType());
		System.out.println("Cake baked with: "+ s.getSyrupType());
	}

}
