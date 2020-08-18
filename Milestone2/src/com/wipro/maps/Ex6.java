package com.wipro.maps;

import java.util.Hashtable;

public class Ex6 {

	public static void main(String[] args) {
	Countrycapital3 countryMap = new Countrycapital3();

	countryMap.saveCountryCapital("India", "Delhi");
	countryMap.saveCountryCapital("Japan", "Tokyo");
	countryMap.saveCountryCapital("USA", "Washington, D.C.");
	
	System.out.println(countryMap.getCapital("India"));
	System.out.println(countryMap.getCountry("Tokyo"));
	
	
	Hashtable<String,String> copy = countryMap.anothermap();
	System.out.println("another Treemap copy => "+copy);
	
	
	System.out.println("ArrayList => "+countryMap.toArrayList());

}


}
