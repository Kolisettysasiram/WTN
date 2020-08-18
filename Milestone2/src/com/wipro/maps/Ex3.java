package com.wipro.maps;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		properties.setProperty("telangana", "hyderabad");
		properties.setProperty("Andhrapradesh", "Amravathi - Kurnool - Vishakapatnam");
		properties.setProperty("Goa", "Panaji");

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<Object, Object> me = it.next();
			System.out.println(me);
		}
	}

}
