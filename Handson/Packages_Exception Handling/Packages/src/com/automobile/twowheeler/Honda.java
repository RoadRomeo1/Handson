package com.automobile.twowheeler;

public class Honda extends com.automobile.Vehicle{

	@Override
	public String getModelName() {
		String name="Shine";
		return name;
	}

	@Override
	public String getRegistrationNumber() {
		String number="1234";
		return number;
	}

	@Override
	public String getOwnerName() {
		String name="Himanshu";
		return name;
	}

	public int getSpeed() {
		int speed=120;
		return speed;
	}
	
	public void cdplayer() {
		System.out.println("Player is playing some audio.......");
	}
	
}
