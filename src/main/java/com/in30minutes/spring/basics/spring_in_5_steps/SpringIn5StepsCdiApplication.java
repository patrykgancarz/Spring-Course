 /* step 18 / 139
 * 
 */


package com.in30minutes.spring.basics.spring_in_5_steps;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.in30minutes.spring.basics.spring_in_5_steps.cdi.SomeCdiBusiness;
import org.springframework.context.ConfigurableApplicationContext;

//import com.in30minutes.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;

//import com.in30minutes.spring.basics.spring_in_5_steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class); 
	
	public static void main(String[] args) {
		
		
		// application context
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		
		SomeCdiBusiness business = 
				applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{} dao--{}", business, business.getSomeCDIDAO());

		
	}
}
