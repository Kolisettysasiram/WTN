package com.mile1.test;
import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import static org.junit.Assert.*;
import org.junit.Test;


public class TC3 {

	StudentReport sr=new StudentReport();
	@Test
	public void test() {
		Student tc1=new Student("charan",new int[] {34,50,40});
		Student tc2=new Student("chiru",new int[] {60,40,21});
		assertEquals("F",sr.findGrades(tc1));
		assertEquals("F",sr.findGrades(tc2));
		assertTrue(sr.findGrades(tc1).equals("F"));
		assertFalse(sr.findGrades(tc2).equals("B"));
	}

}
