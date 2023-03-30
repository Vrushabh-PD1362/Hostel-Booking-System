package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Hostel;

public class HostelDao {

	private Connection conn;

	public HostelDao(Connection conn) {
		super();
		this.conn = conn;
	}

	
	public boolean addHostel(Hostel h) {
		boolean f = false;

		try {

			String sql = "INSERT INTO hostel_details(hostel_name, hostel_address, hostel_phone, hostel_rules, hostel_amenities, hostel_email, hostel_password, hostel_deposit, hostel_rent) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, h.getHostel_name());
			ps.setString(2, h.getHostel_address());
			ps.setString(3, h.getHostel_phone());
			ps.setString(4, h.getHostel_rules());
			ps.setString(5, h.getHostel_amenities());
			ps.setString(6, h.getHostel_email());
			ps.setString(7, h.getHostel_password());
			ps.setInt(8, h.getHostel_deposit());
			ps.setInt(9, h.getHostel_rent());

			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return f;
	}
	
	
	public List<Hostel> getAllHostel()
	{
		List<Hostel> list = new ArrayList<Hostel>();
		Hostel h = null;
		
		try {
			String sql="SELECT * FROM hostel_details ORDER BY hostel_id DESC";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ResultSet rs= ps.executeQuery();		
			
			while(rs.next()) 
			{
				h = new Hostel();
				h.setHostel_id(rs.getInt(1));
				h.setHostel_name(rs.getString(2));
				h.setHostel_address(rs.getString(3));
				h.setHostel_phone(rs.getString(4));
				h.setHostel_rules(rs.getString(5));
				h.setHostel_amenities(rs.getString(6));
				h.setHostel_email(rs.getString(7));
				h.setHostel_password(rs.getString(8));	
				h.setHostel_deposit(rs.getInt(9));
				h.setHostel_rent(rs.getInt(10));
				
				list.add(h); 
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	

	public Hostel getHostelById(int hostel_id) {

		Hostel h = null;
		try {

			String sql = "SELECT * FROM hostel_details where hostel_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, hostel_id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				h = new Hostel();
				h.setHostel_id(rs.getInt(1));
				h.setHostel_name(rs.getString(2));
				h.setHostel_address(rs.getString(3));
				h.setHostel_phone(rs.getString(4));
				h.setHostel_rules(rs.getString(5));
				h.setHostel_amenities(rs.getString(6));
				h.setHostel_email(rs.getString(7));
				h.setHostel_password(rs.getString(8));	
				h.setHostel_deposit(rs.getInt(9));
				h.setHostel_rent(rs.getInt(10));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return h;
	}
	

	public boolean updateHostel(Hostel h) {
		boolean f = false;

		try {
			String sql = "UPDATE hostel_details SET hostel_name=?, hostel_address=?,hostel_phone=?,hostel_rules=?,hostel_amenities=?,hostel_email=?,hostel_password=?, hostel_deposit=?, hostel_rent=? WHERE hostel_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, h.getHostel_name());
			ps.setString(2, h.getHostel_address());
			ps.setString(3, h.getHostel_phone());
			ps.setString(4, h.getHostel_rules());
			ps.setString(5, h.getHostel_amenities());
			ps.setString(6, h.getHostel_email());
			ps.setString(7, h.getHostel_password());
			ps.setInt(8, h.getHostel_deposit());
			ps.setInt(9, h.getHostel_rent());
			
			int i = ps.executeUpdate();

			if (i == 1) {
				f = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean deleteHostel(int hostel_id) {
		boolean f = false;
		try {
			String sql = "delete from hostel_details where hostel_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, hostel_id);

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public Hostel login(String hostel_email, String hostel_password) {
		
		Hostel h = null;
		try {

			String sql = "select * from hostel_details where hostel_email=? and hostel_password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, hostel_email);
			ps.setString(2, hostel_password);

			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				h = new Hostel();
				h.setHostel_id(rs.getInt(1));
				h.setHostel_name(rs.getString(2));
				h.setHostel_address(rs.getString(3));
				h.setHostel_phone(rs.getString(4));
				h.setHostel_rules(rs.getString(5));
				h.setHostel_amenities(rs.getString(6));
				h.setHostel_email(rs.getString(7));
				h.setHostel_password(rs.getString(8));	
				h.setHostel_deposit(rs.getInt(9));
				h.setHostel_rent(rs.getInt(10));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return h;
	}

	public int countHostel() {
		int i = 0;
		try {
			String sql = "select * from hostel_details";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public int countBooking() {
		int i = 0;
		try {
			String sql = "select * from booking_details";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public int countBookingByHostelId(int hostel_id) {
		int i = 0;
		try {
			String sql = "select * from booking_details where hostel_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, hostel_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}

	public int countUser() {
		
		int i = 0;
		try {
			String sql = "select * from user_details";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				i++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return i;
	}



	public boolean changePassword(int user_id, String newPassword) {
		boolean f = false;

		try {
			String sql = "update doctor set user_password=? where user_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, newPassword);
			ps.setInt(2, user_id);

			int i = ps.executeUpdate();
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	

}
