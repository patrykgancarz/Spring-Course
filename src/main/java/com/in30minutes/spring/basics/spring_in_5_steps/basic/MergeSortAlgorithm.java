package com.in30minutes.spring.basics.spring_in_5_steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("merge")
public class MergeSortAlgorithm implements SortAlgorithm{
	public int[] sort(int [] numbers) {
		//logic
		return numbers;
	}
}
