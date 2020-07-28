package com.wipro.test;

import com.wipro.task.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringConcat {

	@Test
	public void dostringConcattest() {
		//fail("Not yet implemented");
		DailyTasks d=new DailyTasks();
		assertEquals("Sasi Ram",d.dostringConcat("Sasi","Ram"));
	}
	
}
