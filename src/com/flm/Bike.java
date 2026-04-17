package com.flm;

public class Bike {
	String color;
	int speed;
	int gear;
	int q=9; 
	Bike(){
		
	}

	
	Bike(String c){
		color=c;
	}
	
	void increasegear() {
		gear++;
	}
	
	void accelerate() {
		speed++;
	}
	
	void brake() {
		speed--;
	}
	
	
	

}
