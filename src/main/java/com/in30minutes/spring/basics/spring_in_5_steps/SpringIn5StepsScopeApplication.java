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
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class); 
	
	public static void main(String[] args) {
		
		
		// application context
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
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
	
	
	
	
	
	
	
	
	/*Code used for Basic package - Part 1 and Part 2 up to step 14
	 * 
	 * 
	 * //what are the beans --> @componet //what are the dependencies --> @autowired
	 * //where to search for beans --> @SpringBootApplication (No need to ad -
	 * springboot autoscans main package
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * //Spring will do that: //BinarySearchImpl binarySearch = // new
	 * BinarySearchImpl(new QuickSortAlgorithm());
	 * 
	 * // application context ConfigurableApplicationContext applicationContext =
	 * SpringApplication.run(SpringIn5StepsApplication.class, args);
	 * 
	 * BinarySearchImpl binarySearch =
	 * applicationContext.getBean(BinarySearchImpl.class);
	 * 
	 * BinarySearchImpl binarySearch1 =
	 * applicationContext.getBean(BinarySearchImpl.class);
	 * System.out.println(binarySearch); System.out.println(binarySearch1);
	 * 
	 * 
	 * int result = binarySearch.binarySearch(new int[] {2, 4, 6}, 3);
	 * 
	 * System.out.println(result); }
	 */

}
