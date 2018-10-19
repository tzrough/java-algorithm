package com.tzrough.sort;

import org.junit.Test;

import com.tzrough.sort.constant.DataAmount;

public class BubbleSortTest
{
		
	@Test
	public void test() 
	{
		BubbleSort bubbleSort = new BubbleSort();
		
		bubbleSort.sort(ArrayGenerator.generate(DataAmount.oneK));
		bubbleSort.sort(ArrayGenerator.generate(DataAmount.tenK));
		bubbleSort.sort(ArrayGenerator.generate(DataAmount.oneM));
		bubbleSort.sort(ArrayGenerator.generate(DataAmount.tenM));
		
		
	}

}
