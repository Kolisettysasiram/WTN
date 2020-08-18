package com.wipro.List;

import java.util.Iterator;
import java.util.Vector;

public class Ex6 {

	public static void main(String[] args) {
		
		Vector<String> calendar=new Vector<String> ();
		calendar.add("January");
		calendar.add("February");
		calendar.add("March");
		calendar.add("April");
		calendar.add("May");
		calendar.add("June");
		calendar.add("July");
		calendar.add("August");
		calendar.add("September");
		calendar.add("October");
		calendar.add("November");
		calendar.add("December");
		
		Iterator<String> i=calendar.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
