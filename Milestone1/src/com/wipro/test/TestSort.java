package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

	@Test
	public void sortValuestest() {
		
		DailyTasks d=new DailyTasks();
		assertArrayEquals(new int[]{1,2,3},d.sortValues(new int[]{3,2,1}));
		
	}
		

}
