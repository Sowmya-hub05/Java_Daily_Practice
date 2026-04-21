package com.flm.Inheritence;

public class POLYMORPHISMOverHiding {
	
	public static void main(String[] args) {
		
		
	
		Audi a1=new Audi();
		a1.askdirections(); //Overriding
		
		Car c=new Car();
		c.askdirections();
		
		
	}

}
