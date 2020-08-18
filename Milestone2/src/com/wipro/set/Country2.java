package com.wipro.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Country2 {
	TreeSet<String> ts=new TreeSet<String> ();
	TreeSet<String> saveCountryNames(String CountryName)
	{
		ts.add(CountryName);
		return ts;
	}
    
	String getCountry(String CountryName)
	{
		Iterator<String> it=ts.iterator();
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}

}

