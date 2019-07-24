package com.automobile.fourwheeler;

public class Logan extends com.automobile.Vehicle{

	@Override
	public String getModelName() {
	String name="Logan 120A";
	return name;
	}

	@Override
	public String getRegistrationNumber() {
	String number="12A70bQ";
	return number;
	}

	@Override
	public String getOwnerName() {
	String name="Chris Hemsworth";
	return name;
	}
	
	public int speed() {
		int speed=180;
		return speed;
	}
	
	public int gps() {
		int gps=123456;
		return gps;
	}

}
