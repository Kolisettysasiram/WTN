package com.wipro.set;

import java.util.HashSet;
import java.util.Iterator;

public class Country {
	HashSet<String> h=new HashSet<String> ();
	HashSet<String> saveCountryNames(String CountryName)
	{
		h.add(CountryName);
		return h;
	}
    
	String getCountry(String CountryName)
	{
		Iterator<String> it=h.iterator();
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}

}
