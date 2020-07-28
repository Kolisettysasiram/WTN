package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.exception.*;
import com.mile1.service.*;
public class StudentMain {
	static Student data [] = new Student [4];
	static  {

		for (int i = 0; i < data. length; i++) {
			 data [i]= new Student();
			}
		data[0]=new Student("sekhar",new int[] {85,75,95});
		data[1]=new Student(null,new int[] {11,22,33});
		data[2]=null;
		data[3]=new Student("Manoj",null);
		
				

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentReport studentReport = new StudentReport();
		StudentService studentService = new StudentService();
		
		System.out.println("Student Grades:-");
		
		String x = null;
		
		for (int i = 0; i < data.length; i++)  {
			try {
				x = studentReport.validate(data[i]);
			} catch (NullNameException e) {
				x = e.toString();
			} catch (NullMarksArrayException e) {
				x = e.toString();
			} catch (NullStudentObjectException e) {
				x = e.toString();
			}
			if(x.equals("valid")) {
				String q=studentReport.findGrades(data[i]);
			System.out.println("Student "+i+" Grade = " +q);
			}
			else
			{
				System.out.println("Student "+i+" Grade = "+x);
			}
		}
		System.out.println("-------------NULL COUNT----------------");
		     System.out.println("Number of Objects with Marks array as null = " +studentService.findNumberOfNullMarksArray(data));
             System.out.println("Number of Objects with Name as null = " +studentService.findNumberOfNullName(data));
             System.out.println("Number of Objects that are entierly null = " +studentService.findNumberOfNullObjects(data));
	}

}
