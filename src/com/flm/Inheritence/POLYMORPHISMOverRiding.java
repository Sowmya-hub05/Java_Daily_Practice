package com.flm.Inheritence;

import com.flm.Arguments;

public class POLYMORPHISMOverRiding extends Arguments {
	
	public static void main(String[] args) {
		
		
	
		Audi a1=new Audi();
		a1.askdirections(); //Overriding
		a1.breaks();  // Method HIDING
		
		Car c=new Car();
		c.askdirections();
		c.breaks();
		
		
		
	}

}
