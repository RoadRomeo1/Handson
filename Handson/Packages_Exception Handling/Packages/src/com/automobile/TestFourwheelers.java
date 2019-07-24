package com.automobile;

import com.automobile.fourwheeler.Ford;
import com.automobile.fourwheeler.Logan;

public class TestFourwheelers {
public static void main(String[] args) {
	Logan l=new Logan();
	Ford f=new Ford();
	
	
	System.out.println("Logan:");
	System.out.println("Model Name is "+l.getModelName()+".");
	System.out.println("Speed is "+l.speed()+"km/h.");
	System.out.println("Feature gps code is "+l.gps()+".");
	System.out.println("Owner name is "+l.getOwnerName()+".");
	System.out.println("Registration Number is "+l.getRegistrationNumber()+".");
	
	
	System.out.println("");
	System.out.println("");
	
	
	System.out.println("Ford:");
	System.out.println("Modal name is "+f.getModelName()+".");
	System.out.println("Speed is "+f.speed()+"km/h.");
	System.out.println("Feature TempControl code is "+f.tempControl()+".");
	System.out.println("Owner name is "+f.getOwnerName()+".");
	System.out.println("Registration number is "+f.getRegistrationNumber()+".");
	
}
}
