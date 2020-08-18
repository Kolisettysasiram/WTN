package com.wipro.List;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList<String> calendar=new ArrayList<String>();
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
		for(int i=0;i<calendar.size();i++)
		{
			System.out.println(calendar.get(i));
		}

	}

}
