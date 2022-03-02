package com.in30minutes.spring.basics.spring_in_5_steps;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
	
	//sorting an array
	//search the array
	//return the result
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		//implement sorting logic
		//serach the array
		return 3;
		
	}
	
	
	
}
