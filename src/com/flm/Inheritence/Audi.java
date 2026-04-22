package com.flm.Inheritence;

public class Audi extends Car{
	int y=3;
	
	
	void Siri() {
		System.out.println(" Hey Siri is not there! ");
		
	}
	
	@Override
	void askdirections() {
		System.out.println("Ask Siri for the Directions");
	}
	
	
	static void breaks() {
		System.out.println("The breaks are automatic"); // Method HIDING
	}
	
	
	
	
}
