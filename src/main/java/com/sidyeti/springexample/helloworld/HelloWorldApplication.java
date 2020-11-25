package com.sidyeti.springexample.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		BinarySearch bs = context.getBean(BinarySearch.class);
		bs.search(new int[]{5,2,3,1,4},3);
	}

}
