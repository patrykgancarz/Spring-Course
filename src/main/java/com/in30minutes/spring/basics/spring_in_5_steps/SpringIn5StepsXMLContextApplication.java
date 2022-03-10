package com.in30minutes.spring.basics.spring_in_5_steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in30minutes.spring.basics.spring_in_5_steps.xml.XmlPersonDAO;

@Configuration
@ComponentScan//("com.in30minutes.spring.basics.spring_in_5_steps")
public class SpringIn5StepsXMLContextApplication {
  
	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class); 
	
	  public static void main(String[] args) {
	  

	  
	  //application context setup from XML file
		  try (ClassPathXmlApplicationContext applicationContext =
				  new ClassPathXmlApplicationContext(
						  "applicationContext.xml")) {

			  LOGGER.info("Beans Loaded -> {}",
					  (Object)applicationContext.getBeanDefinitionNames());
			  
			  XmlPersonDAO personDAO =
				  applicationContext.getBean(XmlPersonDAO.class);

		  LOGGER.info("{} {}", personDAO, personDAO.getXmlJdbcConnection());

		  }
		  
	  }
	 

}

