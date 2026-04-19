package com.flm.Inheritence;

public class FuelCar extends Car{
	int b=7;
	String color="Red"; 
	FuelCar(){
		System.out.println("FuelCar constructor");
	}
	
	void fuel() {
		System.out.println("Fuel is full...");
	}
     
	
	
	void print() {
		System.out.println(this.color);
		System.out.println(super.color);
		System.out.println(color);
	}
	
	
	
	
	
	
}
