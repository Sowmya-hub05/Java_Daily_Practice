package com.flm;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int num1=sc.nextInt();
		System.out.println("Enter the operation you want to perform: ");
		String operator=sc.next();
		System.out.println("Enter 2nd number: ");
		int num2=sc.nextInt();
		switch(operator) {
			case "+":
				System.out.println("Result:"+(num1+num2));
				break;
			case "-":
				System.out.println("Result:"+(num1-num2));
				break;
			case "*":
				System.out.println("Result:"+(num1*num2));
				break;
			case "/":
				System.out.println("Result:"+(num1/num2));
				break;
			default:
				System.out.println("Result:"+(num1%num2));
				
				
				
		}
		
	}

}
