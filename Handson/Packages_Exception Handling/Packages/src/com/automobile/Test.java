package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;

public class Test {
public static void main(String[] args) {
Hero h1=new Hero();
Honda h2=new Honda();

System.out.println("Hero:");
System.out.println("Regitration Number is: "+h1.getRegistrationNumber());
System.out.println("Model Name is: "+h1.getModelName());
System.out.println("Speed of the "+h1.getModelName()+" is "+h1.getSpeed());
System.out.println("Owner name is: "+h1.getOwnerName());
h1.radio();

System.out.println("");
System.out.println("");


System.out.println("Honda:");
System.out.println("Regitration Number is: "+h2.getRegistrationNumber());
System.out.println("Model Name is: "+h2.getModelName());
System.out.println("Speed of the "+h2.getModelName()+" is "+h1.getSpeed());
System.out.println("Owner name is: "+h2.getOwnerName());
h2.cdplayer();

}
}
