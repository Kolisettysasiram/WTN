package com.wipro.List;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex5 {

	public static void main(String[] args)
	{
		LinkedList<String> calendar=new LinkedList<String> ();
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
		
		Iterator<String> itr=calendar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	
}
