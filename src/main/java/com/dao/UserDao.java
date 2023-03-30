package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.User;

public class UserDao {
	
	private Connection conn;
	
	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}

	
	public boolean userRegister(User u)
	{
		boolean f = false;
		
		try {
			String sql="INSERT INTO user_details(user_name, user_email, user_password) values(?, ?, ?)";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, u.getUser_name());
			ps.setString(2, u.getUser_email());
			ps.setString(3, u.getUser_password());
			
			int i = ps.executeUpdate();
			
			if(i ==1)
			{
				f = true;
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return f;
	}
	
	
	public User userLogin(String user_email, String user_password)
	{
		User u = null;
		
		try
		{
			String sql = "SELECT * FROM user_details WHERE user_email= ? and user_password=?";
			
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, user_email);
			ps.setString(2,  user_password);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) 
			{
				u = new User();
				
				u.setUser_id(rs.getInt(1));
				u.setUser_name(rs.getString(2));
				u.setUser_email(rs.getString(3));
				u.setUser_password(rs.getString(4));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return u;
	}

}
