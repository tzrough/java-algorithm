package com.tzrough.sort;

import java.util.Random;

import com.sun.org.apache.regexp.internal.recompile;

public class ArrayGenerator
{
	
	public static int[] generate(int size)
	{
		
		int[] a = new int[size];
		Random random = new Random();
		
		for (int i = 0; i < size; i++)
		{
			a[i] = random.nextInt();
		}
		
		return a;
	}
	
	// 升序检查
	public boolean checkSorted(int[] a) 
	{
		boolean flag = true;
		
		for (int i = 0; i < a.length - 1; i++)
		{
			if(a[i] > a[i+1]) 
			{
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
}
