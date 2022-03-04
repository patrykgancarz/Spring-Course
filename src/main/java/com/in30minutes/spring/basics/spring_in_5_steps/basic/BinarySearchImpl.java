package com.in30minutes.spring.basics.spring_in_5_steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("merge")
	private SortAlgorithm sortAlgorithm;

	/*
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm) { super();
	 * this.sortAlgorithm = sortAlgorithm; }
	 */

	public int binarySearch(int[] numbers, int numberToSearchFor) {

		// BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		// implement sorting logic
		// serach the array
		return 3;

	}

	
	@PostConstruct 
	public void postConstruct() { 
		logger.info("postConstruct"); 
	}
	 

	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}

}
