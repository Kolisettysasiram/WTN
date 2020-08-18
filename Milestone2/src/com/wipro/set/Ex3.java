package com.wipro.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex3 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String> (Collections.reverseOrder());
		ts.add("rat");
		ts.add("cat");
		ts.add("dog");
		
		Iterator<String> it=ts.iterator();
		
		String query = "rat";
		boolean result = false;
		
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");
		
		
		

	}

}
