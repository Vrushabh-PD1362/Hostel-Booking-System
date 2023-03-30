package com.entity;

public class Hostel {
	private int hostel_id;
	private String hostel_name;
	private String hostel_address;
	private String hostel_phone;
	private String hostel_rules;
	private String hostel_amenities;
	private String hostel_email;
	private String hostel_password;
	private int hostel_deposit;
	private int hostel_rent;
	
	
	public Hostel() {
		super();
		
	}


	public Hostel(String hostel_name, String hostel_address, String hostel_phone, String hostel_rules,
			String hostel_amenities, String hostel_email, String hostel_password, int hostel_deposit, int hostel_rent) {
		super();
		this.hostel_name = hostel_name;
		this.hostel_address = hostel_address;
		this.hostel_phone = hostel_phone;
		this.hostel_rules = hostel_rules;
		this.hostel_amenities = hostel_amenities;
		this.hostel_email = hostel_email;
		this.hostel_password = hostel_password;
		this.hostel_deposit = hostel_deposit;
		this.hostel_rent = hostel_rent;
	}


	public Hostel(int hostel_id, String hostel_name, String hostel_address, String hostel_phone, String hostel_rules,
			String hostel_amenities, String hostel_email, String hostel_password, int hostel_deposit, int hostel_rent) {
		super();
		this.hostel_id = hostel_id;
		this.hostel_name = hostel_name;
		this.hostel_address = hostel_address;
		this.hostel_phone = hostel_phone;
		this.hostel_rules = hostel_rules;
		this.hostel_amenities = hostel_amenities;
		this.hostel_email = hostel_email;
		this.hostel_password = hostel_password;
		this.hostel_deposit = hostel_deposit;
		this.hostel_rent = hostel_rent;
	}


	public int getHostel_id() {
		return hostel_id;
	}


	public void setHostel_id(int hostel_id) {
		this.hostel_id = hostel_id;
	}


	public String getHostel_name() {
		return hostel_name;
	}


	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}


	public String getHostel_address() {
		return hostel_address;
	}


	public void setHostel_address(String hostel_address) {
		this.hostel_address = hostel_address;
	}


	public String getHostel_phone() {
		return hostel_phone;
	}


	public void setHostel_phone(String hostel_phone) {
		this.hostel_phone = hostel_phone;
	}


	public String getHostel_rules() {
		return hostel_rules;
	}


	public void setHostel_rules(String hostel_rules) {
		this.hostel_rules = hostel_rules;
	}


	public String getHostel_amenities() {
		return hostel_amenities;
	}


	public void setHostel_amenities(String hostel_amenities) {
		this.hostel_amenities = hostel_amenities;
	}


	public String getHostel_email() {
		return hostel_email;
	}


	public void setHostel_email(String hostel_email) {
		this.hostel_email = hostel_email;
	}


	public String getHostel_password() {
		return hostel_password;
	}


	public void setHostel_password(String hostel_password) {
		this.hostel_password = hostel_password;
	}


	public int getHostel_deposit() {
		return hostel_deposit;
	}


	public void setHostel_deposit(int hostel_deposit) {
		this.hostel_deposit = hostel_deposit;
	}


	public int getHostel_rent() {
		return hostel_rent;
	}


	public void setHostel_rent(int hostel_rent) {
		this.hostel_rent = hostel_rent;
	}



	
	
	
}
