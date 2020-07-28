package com.mile1.test;
import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import static org.junit.Assert.*;
import org.junit.Test;

public class TC1 {
	
	StudentReport sr=new StudentReport();
	@Test
	public void test() {
		Student tc1=new Student("sekhar",new int[] {80,80,80});
		Student tc2=new Student("sekhar",new int[] {90,60,90});
		assertEquals("A",sr.findGrades(tc1));
		assertEquals("A",sr.findGrades(tc2));
		assertTrue(sr.findGrades(tc1).equals("A"));
		assertFalse(sr.findGrades(tc2).equals("B"));
	}
	
	

}
