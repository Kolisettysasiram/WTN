package com.wipro.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String> ();
		al.add("kamal");
		al.add("Raj");
		al.add("charan");
		printAll(al);
		}
	public static void printAll(ArrayList<String> al) {
		Iterator<String> it = al.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}

}
