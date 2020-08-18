package com.wipro.set;

import java.util.HashSet;
import java.util.Iterator;

public class Ex2 {

	public static void main(String[] args)
	{
		HashSet<String> empnames=new HashSet<String> ();
		empnames.add("Ram");
		empnames.add("charan");
		empnames.add("kalyan");
		empnames.add("sai");
		
		Iterator<String> i=empnames.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
