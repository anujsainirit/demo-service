package com.hcl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DemoServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoServiceApplication.class, args);
		
		/*
		 * String[] names = ctx.getBeanDefinitionNames();
		 * 
		 * for (String name : names) { System.out.println(name); }
		 */
	}

}
