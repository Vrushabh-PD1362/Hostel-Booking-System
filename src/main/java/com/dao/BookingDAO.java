package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.entity.Booking;

public class BookingDAO {

	private Connection conn;

	public BookingDAO(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addBooking(Booking book) {
		
		boolean f = false;

		try {

			String sql = "INSERT INTO booking_details(user_id, name, gender, age, booking_date, email, hostel_id, booking_duration, address, booking_status, phone) values(?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, book.getUser_id());
			ps.setString(2, book.getName());
			ps.setString(3, book.getGender());
			ps.setString(4, book.getAge());
			ps.setString(5, book.getBooking_date());
			ps.setString(6, book.getEmail());
			ps.setInt(7, book.getHostel_id());
			ps.setString(8, book.getBooking_duration());
			ps.setString(9, book.getAddress());
			ps.setString(10, book.getBooking_status());
			ps.setString(11, book.getPhone());

			int i = ps.executeUpdate();
			
			if (i == 1) {
				f = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}

	public List<Booking> getAllBookingByLoginUser(int user_id) {
		List<Booking> list = new ArrayList<Booking>();
		Booking book = null;

		try {

			String sql = "SELECT * FROM booking_details where user_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, user_id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				book = new Booking();
				book.setBooking_id(rs.getInt(1));
				book.setUser_id(rs.getInt(2));
				book.setName(rs.getString(3));
				book.setGender(rs.getString(4));
				book.setAge(rs.getString(5));
				book.setBooking_date(rs.getString(6));
				book.setEmail(rs.getString(7));
				book.setHostel_id(rs.getInt(8));
				book.setBooking_duration(rs.getString(9));
				book.setAddress(rs.getString(10));
				book.setBooking_status(rs.getString(11));
				book.setPhone(rs.getString(12));
				list.add(book);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Booking> getAllBookingByHostelLogin(int hostel_id) {
		List<Booking> list = new ArrayList<Booking>();
		Booking book = null;

		try {

			String sql = "select * from booking_details where hostel_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, hostel_id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				

				book = new Booking();
				book.setBooking_id(rs.getInt(1));
				book.setUser_id(rs.getInt(2));
				book.setName(rs.getString(3));
				book.setGender(rs.getString(4));
				book.setAge(rs.getString(5));
				book.setBooking_date(rs.getString(6));
				book.setEmail(rs.getString(7));
				book.setHostel_id(rs.getInt(8));
				book.setBooking_duration(rs.getString(9));
				book.setAddress(rs.getString(10));
				book.setBooking_status(rs.getString(11));
				book.setPhone(rs.getString(12));
				list.add(book);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public Booking getBookingById(int booking_id) {

		Booking book = null;

		try {

			String sql = "select * from booking_details where booking_id=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, booking_id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				

				book = new Booking();
				book.setBooking_id(rs.getInt(1));
				book.setUser_id(rs.getInt(2));
				book.setName(rs.getString(3));
				book.setGender(rs.getString(4));
				book.setAge(rs.getString(5));
				book.setBooking_date(rs.getString(6));
				book.setEmail(rs.getString(7));
				book.setHostel_id(rs.getInt(8));
				book.setBooking_duration(rs.getString(9));
				book.setAddress(rs.getString(10));
				book.setBooking_status(rs.getString(11));
				book.setPhone(rs.getString(12));
				

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	
	public List<Booking> getAllBooking() {
		List<Booking> list = new ArrayList<Booking>();
		Booking book = null;

		try {

			String sql = "select * from booking_details order by booking_id desc";
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				book = new Booking();
				book.setBooking_id(rs.getInt(1));
				book.setUser_id(rs.getInt(2));
				book.setName(rs.getString(3));
				book.setGender(rs.getString(4));
				book.setAge(rs.getString(5));
				book.setBooking_date(rs.getString(6));
				book.setEmail(rs.getString(7));
				book.setHostel_id(rs.getInt(8));
				book.setBooking_duration(rs.getString(9));
				book.setAddress(rs.getString(10));
				book.setBooking_status(rs.getString(11));
				book.setPhone(rs.getString(12));
				list.add(book);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}