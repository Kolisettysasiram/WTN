package com.wipro.hms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.hms.bean.RentalPropertyBean;
import com.wipro.hms.util.DBUtil;

public class RentalPropertyDAO{
	
	public String generatePropertyID(String city) throws ClassNotFoundException, SQLException
	{
		String id="";
		id=id+city.substring(0,3).toUpperCase();
		Connection con=DBUtil.getDBConnection();
		String sql="select RENTAL_SEQ.nextval from dual";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs =st.executeQuery();
		if(rs.next())
		{
			id=id+rs.getInt(1);
		}
		return id;
	}
	public int createRentalProperty(RentalPropertyBean bean) 
	{
		int success=-1;
		try {
		RentalPropertyDAO dao=new RentalPropertyDAO();
		String id=dao.generatePropertyID(bean.getCity());
		bean.setPropertyId(id);
		Connection con=DBUtil.getDBConnection();
		String sql="insert into RENTAL_TBL values(?,?,?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, bean.getPropertyId());
		st.setFloat(2,bean.getRentalAmount());
		st.setInt(3,bean.getNoOfBedRooms());
		st.setString(5,bean.getCity());
		st.setString(4,bean.getLocation());
		success=st.executeUpdate();
		}
		catch(Exception e)
		{
		  e.printStackTrace();	
		}
		return success;
	}
	

}
