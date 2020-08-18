package com.wipro.maps;

import java.util.TreeMap;

public class Ex5 {

	public static void main(String[] args) {

		Countrycapital2 countryMap = new Countrycapital2();

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		
		
		TreeMap<String,String> copy = countryMap.anothermap();
		System.out.println("another Treemap copy => "+copy);
		
		
		System.out.println("ArrayList => "+countryMap.toArrayList());

	}


}
