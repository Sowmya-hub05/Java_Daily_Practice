package com.flm;

public class Variabless {
	int q=6;
	public static void main(String[] args) {
		
		Students s1=new Students();
		s1.name="sowmya";
		s1.marks=7;
		String result=s1.rank(s1.marks);
		System.out.println(result);
		
		//-------------------------------------------------------
		
		Bike myBike= new Bike("blue");
		myBike.color="Black";
		myBike.speed=8;
		myBike.gear=0;
		myBike.increasegear();
		myBike.accelerate();
		System.out.println(myBike.speed);
		System.out.println(myBike.color);
		myBike.brake();
		System.out.println(myBike.speed);
		
		Bike frnd=new Bike("red");
		frnd.speed=3;
		System.out.println(frnd.speed);
		System.out.println(frnd.color);
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
