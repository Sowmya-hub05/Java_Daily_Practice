package com.flm.Inheritence;

public class Car extends Vehicle{
	int y=5;
	String color="Black";
	Car(){
		System.out.println("Car Constructor");
	}
	
	void tyres() {
		System.out.println("4 tyres working for the car....");
	}
	
	void askdirections() {
		System.out.println("Ask Strangers for directions");
	}
	
	static void breaks() {
		System.out.println("Apply breaks with legs");
	}
	 
	
}
