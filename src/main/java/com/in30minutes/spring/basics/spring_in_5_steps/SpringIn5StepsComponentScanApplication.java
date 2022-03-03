/*
 * step 16 / 139
 * 
 */


package com.in30minutes.spring.basics.spring_in_5_steps;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.in30minutes.spring.basics.spring_in_5_steps.basic.BinarySearchImpl;
import com.in30minutes.spring.basics.spring_in_5_steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class); 
	
	public static void main(String[] args) {
		
		
		// application context
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsComponentScanApplication.class, args);
		
		PersonDAO personDao = 
				applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDao2 = 
				applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}", personDao);
		LOGGER.info("{}", personDao.getJdbcConnection());
		LOGGER.info("{}", personDao.getJdbcConnection());
		
		LOGGER.info("{}", personDao2);
		LOGGER.info("{}", personDao2.getJdbcConnection());
		
	}
}