package com.wipro.maps;


public class Ex4 {

	public static void main(String[] args) {
		contactlist contactsList = new contactlist ();
		
		contactsList.addContact("charan", 898548);
		contactsList.addContact("ambulance", 100);
		contactsList.addContact("ram", 966666);
				
		System.out.println("Police: " + contactsList.doesContactNameExist("Police"));
		System.out.println("98765432: " + contactsList.doesContactNumberExist(98765432));
		
		System.out.println();
		contactsList.listAllContacts();
	}
}
