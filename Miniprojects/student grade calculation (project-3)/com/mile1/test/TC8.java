package com.mile1.test;

import static org.junit.Assert.*;
import com.mile1.bean.Student;
import com.mile1.service.*;
import org.junit.Test;

public class TC8 {
	
	static Student data [] = new Student [6];
	static {

		for (int i = 0; i < data. length; i++) {
			 data [i]= new Student();
			}
		data[0]=new Student("sekhar",new int[] {85,75,95});
		data[1]=new Student(null,new int[] {11,22,33});
		data[2]=null;
		data[3]=new Student("Manoj",null);
		data[4]=new Student("sekhar",new int[] {85,75,95});
		data[5]=null;
		
	}
    StudentService sc=new StudentService();
	@Test
	public void test() {
		assertEquals(2,sc.findNumberOfNullObjects(data));
		assertTrue(2==sc.findNumberOfNullObjects(data));
		assertFalse(1==sc.findNumberOfNullObjects(data));
	}

}
