package com.mile1.test;
import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import static org.junit.Assert.*;
import org.junit.Test;


public class TC2 {

	StudentReport sr=new StudentReport();
	@Test
	public void test() {
		Student tc1=new Student("kiran",new int[] {40,50,40});
		Student tc2=new Student("sai",new int[] {60,40,35});
		assertEquals("C",sr.findGrades(tc1));
		assertEquals("C",sr.findGrades(tc2));
		assertTrue(sr.findGrades(tc1).equals("C"));
		assertFalse(sr.findGrades(tc2).equals("B"));
	}
	

}
