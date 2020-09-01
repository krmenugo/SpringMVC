package com.krmenugo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
@SpringBootApplication
public class DemoSpringMvcApplication extends SpringBootServletInitializer {// implements CommandLineRunner {
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringMvcApplication.class, args);
	}
//	public void run(String... args) throws Exception{
//		String pass1 = "user";
//		String pass2 = "admin";
//		
//		System.out.println("\nPassword 1: " + passwordEncoder.encode(pass1));
//		System.out.println("Password 2: " + passwordEncoder.encode(pass2) + "\n");
//	}
//	
}
