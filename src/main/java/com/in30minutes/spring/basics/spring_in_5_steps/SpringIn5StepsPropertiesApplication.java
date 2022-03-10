package com.in30minutes.spring.basics.spring_in_5_steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in30minutes.spring.basics.spring_in_5_steps.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	  
	  public static void main(String[] args) {

		  try (AnnotationConfigApplicationContext applicationContext =
				  new AnnotationConfigApplicationContext(
						  SpringIn5StepsPropertiesApplication.class)) {
	  
		  SomeExternalService service =
				  applicationContext.getBean(SomeExternalService.class);

		  System.out.println(service.returnServiceURL());

		  }
		  
	  }
	 

}






