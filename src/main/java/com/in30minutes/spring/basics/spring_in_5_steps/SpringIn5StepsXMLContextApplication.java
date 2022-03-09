package com.in30minutes.spring.basics.spring_in_5_steps;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in30minutes.spring.basics.spring_in_5_steps.basic.XmlPersonDAO;

@Configuration
@ComponentScan//("com.in30minutes.spring.basics.spring_in_5_steps")
public class SpringIn5StepsXMLContextApplication {
  
	  
	  public static void main(String[] args) {
	  

	  
	  //application context setup from XML file
		  try (ClassPathXmlApplicationContext applicationContext =
				  new ClassPathXmlApplicationContext(
						  "applicationContext.xml")) {

		  XmlPersonDAO personDAO =
				  applicationContext.getBean(XmlPersonDAO.class);

		  System.out.println(personDAO);
		  //System.out.println(personDAO.getXmlJdbcConnection());

		  }
		  
	  }
	 

}
