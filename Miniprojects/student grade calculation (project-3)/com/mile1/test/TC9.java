package com.mile1.test;

import static org.junit.Assert.*;
import com.mile1.bean.Student;
import com.mile1.service.*;
import org.junit.Test;

public class TC9 {
	
	static Student data [] = new Student [8];
	static {

		for (int i = 0; i < data. length; i++) {
			 data [i]= new Student();
			}
		data[0]=new Student("sekhar",new int[] {85,75,95});
		data[1]=new Student(null,new int[] {11,22,33});
		data[2]=null;
		data[3]=new Student("Manoj",null);
		data[4]=new Student("srikar",new int[] {85,75,95});
		data[5]=null;
		data[6]=new Student("chandu",null);
		data[7]=new Student("sandeep",null);
		
		
		
	}
    StudentService sc=new StudentService();
	@Test
	public void test() {
		assertEquals(3,sc.findNumberOfNullMarksArray(data));
		assertTrue(3==sc.findNumberOfNullMarksArray(data));
		assertFalse(1==sc.findNumberOfNullMarksArray(data));
	}

}
