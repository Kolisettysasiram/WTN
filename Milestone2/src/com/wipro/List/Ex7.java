package com.wipro.List;

import java.util.Iterator;
import java.util.Vector;

class Employe
{
	private int empid;
	private String name;
	private String add;
	private float salary;
	public Employe(int empid, String name, String add, float salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.add = add;
		this.salary = salary;
	}
	
	
	
	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", add=" + add + ", salary=" + salary + "]";
	}
	  
}

public class Ex7 {

	public static void main(String[] args) {
		Vector<Employe> e=new Vector<Employe> ();
		Employe e1=new Employe(101,"sasi","Anantapur",50000);
		Employe e2=new Employe(102,"sai","vizag",25000);
		Employe e3=new Employe(103,"ram","guntur",3000);
		Employe e4=new Employe(104,"charan","ongole",45000);
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		
		Iterator<Employe> i=e.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
