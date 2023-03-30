package com.entity;

public class Booking {
	
	private int booking_id;
	private int user_id;
	private String name;
	private String gender;
	private String age;
	private String booking_date;
	private String email;
	private int hostel_id;
	private String booking_duration;
	private String address;
	private String booking_status;
	private String phone;
	
	
	public Booking() {
		super();
		
	}


	public Booking(int user_id, String name, String gender, String age, String booking_date, String email,
			int hostel_id, String booking_duration, String address, String booking_status, String phone) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.booking_date = booking_date;
		this.email = email;
		this.hostel_id = hostel_id;
		this.booking_duration = booking_duration;
		this.address = address;
		this.booking_status = booking_status;
		this.phone = phone;
	}


	public Booking(int booking_id, int user_id, String name, String gender, String age, String booking_date,
			String email, int hostel_id, String booking_duration, String address, String booking_status, String phone) {
		super();
		this.booking_id = booking_id;
		this.user_id = user_id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.booking_date = booking_date;
		this.email = email;
		this.hostel_id = hostel_id;
		this.booking_duration = booking_duration;
		this.address = address;
		this.booking_status = booking_status;
		this.phone = phone;
	}


	public int getBooking_id() {
		return booking_id;
	}


	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getBooking_date() {
		return booking_date;
	}


	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getHostel_id() {
		return hostel_id;
	}


	public void setHostel_id(int hostel_id) {
		this.hostel_id = hostel_id;
	}


	public String getBooking_duration() {
		return booking_duration;
	}


	public void setBooking_duration(String booking_duration) {
		this.booking_duration = booking_duration;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getBooking_status() {
		return booking_status;
	}


	public void setBooking_status(String booking_status) {
		this.booking_status = booking_status;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

}
	
	
	