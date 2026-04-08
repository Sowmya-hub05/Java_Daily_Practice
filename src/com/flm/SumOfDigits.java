package com.flm;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur number: ");
		int num=sc.nextInt();
		int result=0;
		while(num>=1) {
			result=result+num%10;
			num=num/10;
		}
		System.out.println(result);
	}


			
}
