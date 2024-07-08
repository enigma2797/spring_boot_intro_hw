package com.project.spring_boot_intro_hw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntroHwApplication implements CommandLineRunner{

	@Autowired //field injection
	CakeBaker cake;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntroHwApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		cake.bakeCake();
	}

}
