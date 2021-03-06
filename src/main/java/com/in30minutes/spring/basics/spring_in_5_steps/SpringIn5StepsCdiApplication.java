package com.in30minutes.spring.basics.spring_in_5_steps;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
//import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import com.in30minutes.spring.basics.spring_in_5_steps.cdi.SomeCdiBusiness;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.in30minutes.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;

//import com.in30minutes.spring.basics.spring_in_5_steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class); 
	
	public static void main(String[] args) {
		
		
		// application context
		try (AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(
						SpringIn5StepsCdiApplication.class
						)) {
				//SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		
		SomeCdiBusiness business = 
				applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{} dao--{}", business, business.getSomeCDIDAO());
		}
		
	}
}
