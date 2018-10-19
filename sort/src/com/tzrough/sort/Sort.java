package com.tzrough.sort;

public class Sort
{
	protected long startTime;
	protected long endTime;

	
	public void printRunTime(int dataAmount)
	{
		long runtime = endTime - startTime;
		
		String runtimeStr = runtime > 1000 ? runtime / 1000 + " s" : runtime + " ms";
		
		System.out.println(getClassName() + " sort " + dataAmount + " number uses " + runtimeStr);
	}
	
	protected  String getClassName()
	{
		return this.getClass().getSimpleName();
	}
	
}
