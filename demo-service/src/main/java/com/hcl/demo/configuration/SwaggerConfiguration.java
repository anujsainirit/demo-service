package com.hcl.demo.configuration;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {
	
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())              
	          .paths(PathSelectors.any())                          
	          .build().apiInfo(metaData());                                           
	    }

	private ApiInfo metaData() {
		return new ApiInfo("Student-Service Document", "This Document contains the information of student service.", "1.0",
				"THis is an open API", new Contact("Anuj Kumar", "URL", "anuj.kumar@gmail.com"), "www.apache.com","NA", 
				new ArrayList<>());
	}
	
	
	
	 
	 
	 

}
