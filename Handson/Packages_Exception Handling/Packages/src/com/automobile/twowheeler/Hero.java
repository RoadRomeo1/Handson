package com.automobile.twowheeler;


public class Hero extends com.automobile.Vehicle{

	@Override
	public String getModelName() {
		String ModelName="Maestro";
		return ModelName;
	}

	@Override
	public String getRegistrationNumber() {
		String number="12345";
		return number;
	}

	@Override
	public String getOwnerName() {
		String name="himmu";
		return name;
	}

	public int getSpeed() {
		int speed=150;
		return speed;
	}
	
	public void radio() {
		System.out.println("Vehicle is in Control......");
	}
}
