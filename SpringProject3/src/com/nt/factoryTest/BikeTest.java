package com.nt.factoryTest;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class BikeTest {
public static void main(String[] args) {
	
	Bike bike1=BikeFactory.orderBike("Standard");
	bike1.drive();
	System.out.println("----------------------------");
	Bike bike2=BikeFactory.orderBike("Electric");
	bike2.drive();
	System.out.println("----------------------------");
	Bike bike3=BikeFactory.orderBike("Sports");
	bike3.drive();
	System.out.println("----------------------------");
	
}
}
