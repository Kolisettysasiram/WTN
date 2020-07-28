package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

	@Test
	public void checkpresencetest() {
		//fail("Not yet implemented");
		DailyTasks d=new DailyTasks();
		assertEquals(true,d.CheckPresence("sasi","a"));
		assertEquals(true,d.CheckPresence("sasi","i"));
		assertTrue(d.CheckPresence("sasi", "s"));
		assertFalse(d.CheckPresence("sasi", "m"));
	}
	

}
