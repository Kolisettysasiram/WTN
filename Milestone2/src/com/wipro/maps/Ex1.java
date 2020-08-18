package com.wipro.maps;

import java.util.HashMap;

public class Ex1 {

	public static void main(String[] args) {

		Countrycapital countryMap = new Countrycapital();

		countryMap.saveCountryCapital("India", "Delhi");
		countryMap.saveCountryCapital("Japan", "Tokyo");
		countryMap.saveCountryCapital("USA", "Washington, D.C.");
		
		System.out.println(countryMap.getCapital("India"));
		System.out.println(countryMap.getCountry("Tokyo"));
		
		
		HashMap<String, String> copy = countryMap.anothermap();
		System.out.println("another hashmap copy => "+copy);
		
		
		System.out.println("ArrayList => "+countryMap.toArrayList());

	}

}
