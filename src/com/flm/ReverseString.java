package com.flm;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		String s=sc.nextLine();
		ReverseString obj=new ReverseString();
		obj.Reverse(s);
	
	}

	
	 void Reverse(String s) {
		int length=s.length();
		for(int i=length-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
	
	
}
