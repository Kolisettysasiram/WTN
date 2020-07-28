package com.mile1.bean;

import java.util.Arrays;

public class Student {
  String name;
  int marks[];
  public Student()
  {
	  
  }
  public Student(String name,int []marks)
  {
	  this.marks=marks;
	  this.name=name;
  }
	public String getName() {
		return name;
	}
	public int[] getMarks() {
		return marks;
	}
	
	/*public void setName(String name) {
		this.name = name;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}  */
}
