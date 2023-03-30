package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RoomTypeDao {
	
	private Connection conn;

	public RoomTypeDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addRoomType(String roomtype_name)
	{
		boolean f = false;
		
		try {
			
			String sql="INSERT INTO room_type(roomtype_name) values(?)";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,  roomtype_name);
			
			int i = ps.executeUpdate();
			
			if(i==1)
			{
				f = true;
			}
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();	
		}
		
		return f;
	}

}
