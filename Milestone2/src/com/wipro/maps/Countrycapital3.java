package com.wipro.maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Countrycapital3 {

private Hashtable<String, String> hs=new Hashtable<String,String> ();
	
	
	public Hashtable<String, String> saveCountryCapital(String CountryName, String capital) {
		hs.put(CountryName, capital);
		return hs;
	}
	
	
	
	public String getCapital(String CountryName) {
		Set<Entry<String, String>> set = hs.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getKey().equals(CountryName))
				return me.getValue();
		}
		
		return null;
	}
	
	public String getCountry(String capitalName) {
		Set<Entry<String, String>> set = hs.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals(capitalName))
				return me.getKey();
		}
		
		return null;
	}
	
	
	public Hashtable<String, String> anothermap() {
		Hashtable<String, String> hs2 = new Hashtable<String, String>();
		
		Set<Entry<String, String>> set = hs.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			hs2.put(me.getValue(), me.getKey());
		}
		
		return hs2;
	}
	
	public ArrayList<String> toArrayList() {
		ArrayList<String> list = new ArrayList<>();
		
		Set<Entry<String, String>> set = hs.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			list.add(me.getKey());
		}
		
		return list;
	}
	
	
	
}
