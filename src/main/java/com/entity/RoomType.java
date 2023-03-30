package com.entity;

public class RoomType {
	
	private int roomtype_id;
	private String roomtype_name;
	
	
	public RoomType() {
		super();
		
	}

	
	public RoomType(int roomtype_id, String roomtype_name) {
		super();
		this.roomtype_id = roomtype_id;
		this.roomtype_name = roomtype_name;
	}

	
	public int getRoomtype_id() {
		return roomtype_id;
	}

	
	public void setRoomtype_id(int roomtype_id) {
		this.roomtype_id = roomtype_id;
	}

	
	public String getRoomtype_name() {
		return roomtype_name;
	}

	
	public void setRoomtype_name(String roomtype_name) {
		this.roomtype_name = roomtype_name;
	}
	
}
