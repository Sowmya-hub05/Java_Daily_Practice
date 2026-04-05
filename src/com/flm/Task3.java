package com.flm;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Salary Amount: ");
		double salary=sc.nextDouble();
		if (salary<250000){
			System.out.println("Tax is: 0 ");
		}
		else if (salary>=250000 && salary<500000){
			double tax1=5*salary/100;
			System.out.println("Tax is: "+(tax1));
		}
		else if (salary>=500000 && salary<1000000){
				double tax2=20*salary/100;
				System.out.println("Tax is: "+(tax2));	
		}
		else {
			double tax3=30*salary/100;
			System.out.println("Tax is: "+(tax3));
		}
		
		
	}

}
