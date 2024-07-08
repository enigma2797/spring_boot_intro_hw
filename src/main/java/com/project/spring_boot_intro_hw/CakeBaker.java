package com.project.spring_boot_intro_hw;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
	
	private Frosting f;
	private Syrup s;
	
	//constructor injection
	public CakeBaker(Frosting f, Syrup s) {
		super();
		this.f = f;
		this.s = s;
	}


	public void bakeCake()
	{
		System.out.println("Cake baked with: "+ f.getFrostingType()+ " and "+s.getSyrupType());
	}

}
