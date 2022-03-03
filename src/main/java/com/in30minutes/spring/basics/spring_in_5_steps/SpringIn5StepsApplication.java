/*
 * FINISHED PART 1
 * step 13 done
 */


package com.in30minutes.spring.basics.spring_in_5_steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	//what are the beans --> @componet
	//what are the dependencies --> @autowired
	//where to search for beans --> @SpringBootApplication (No need to ad - springboot autoscans main package 
	
	public static void main(String[] args) {
		
		//Spring will do that:
		//BinarySearchImpl binarySearch = 
		//		new BinarySearchImpl(new QuickSortAlgorithm());
		
		// application context
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch1 = 
				applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		
		int result = 
				binarySearch.binarySearch(new int[] {2, 4, 6}, 3);
		
		System.out.println(result);
	}

}
