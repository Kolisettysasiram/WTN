package com.wipro.hms.bean;

public class RentalPropertyBean {
	private float rentalAmount;
	private int noOfBedRooms;
	private String location;
	private String city;           
	private String propertyId;
	public float getRentalAmount() {
		return rentalAmount;
	}
	public int getNoOfBedRooms() {
		return noOfBedRooms;
	}
	public String getLocation() {
		return location;
	}
	public String getCity() {
		return city;
	}
	public String getPropertyId() {
		return propertyId;
	}
	public void setRentalAmount(float rentalAmount) {
		this.rentalAmount = rentalAmount;
	}
	public void setNoOfBedRooms(int noOfBedRooms) {
		this.noOfBedRooms = noOfBedRooms;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}
	

}
