package com.flm;

public class Students {
	String name;
	int marks;
	
	
	
	String rank(int marks) {
		if(marks>90) {
			return "First rank";
		}
		else if(marks>50 && marks<=90) {
			return "Second Rank";
			
		}
		else {
			return "Fail";
		}
	}
	
	

}
