package com.in30minutes.spring.basics.spring_in_5_steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int [] numbers) {
		//logic
		return numbers;
	}

}
