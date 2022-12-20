package com.example.demo.pojo;

import javax.xml.bind.annotation.XmlElement;

public class deatils {
	private String state;
	private String location;
	private String address;
	private String floor;
	private int roomno;

	@XmlElement(name = "state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@XmlElement(name = "location")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@XmlElement(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@XmlElement(name = "floor")
	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	@XmlElement(name = "roomno")
	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	@Override
	public String toString() {
		return "deatils [state=" + state + ", location=" + location + ", address=" + address + ", floor=" + floor
				+ ", roomno=" + roomno + "]";
	}

}
