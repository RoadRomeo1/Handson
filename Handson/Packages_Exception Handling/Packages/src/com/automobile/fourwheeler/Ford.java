package com.automobile.fourwheeler;

public class Ford extends com.automobile.Vehicle{

	@Override
	public String getModelName() {
	String name="Ford figo";
	return name;
	}

	@Override
	public String getRegistrationNumber() {
		String number="121indQR";
		return number;
	}

	@Override
	public String getOwnerName() {
        String name="Jay Vatari";
		return name;
	}
	
	public int speed() {
		int speed=200;
		return speed;
	}
	
	public int tempControl() {
		int control=121;
		return control;
	}

}
