package com.wipro.hms.service;

import com.wipro.hms.bean.RentalPropertyBean;
import com.wipro.hms.dao.RentalPropertyDAO;
import com.wipro.hms.util.InvalidCityException;

public class RentalPropertyService {

	public static void main(String[] args) throws InvalidCityException {
		RentalPropertyBean bean=new RentalPropertyBean();
		bean.setCity("Chennai");
		bean.setLocation("Velachery");
		bean.setNoOfBedRooms(2);
		bean.setRentalAmount(15000);
		RentalPropertyService service=new RentalPropertyService();
		System.out.println(service.addRentalProperty(bean));
	}

	public String addRentalProperty(RentalPropertyBean bean) throws InvalidCityException
	{
		if(bean.getCity()==null || bean.getLocation()==null)
			return "NULL VALUES IN INPUT";
		if(bean.getCity().length()==0 || bean.getNoOfBedRooms()==0 || bean.getLocation().length()==0 || bean.getRentalAmount()==0)
		return "INVALID INPUT";
		RentalPropertyService rs =new RentalPropertyService();
		rs.validateCity(bean.getCity());
		RentalPropertyDAO dao = new RentalPropertyDAO();
		int i=dao.createRentalProperty(bean);
		if(i>0)
			return "SUCCESS";
		else
			return "FAILURE";
		
		
		
	}

	public void validateCity(String city) throws InvalidCityException
	{
		if( ! (city.equalsIgnoreCase("chennai") || city.equalsIgnoreCase("bangalore") ))
		{
			throw new InvalidCityException();
		}
	}
}
