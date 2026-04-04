package com.flm;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a=sc.nextInt();
		if (a>0) {
			System.out.println("positive");
		}
		else if (a<0) {
			System.out.println("Neg");
		}
		else {
			System.out.println("zero");
		}
	}

}
