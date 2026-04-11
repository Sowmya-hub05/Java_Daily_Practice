package com.flm;

import java.util.Scanner;

public class SubStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		String s=sc.nextLine();
		SubStrings obj=new SubStrings();
		obj.Sub(s);
		
	}
	
	void Sub(String s) {
	int length=s.length();
	for(int i=0;i<=length-1;i++) {
		for(int j=i+1;j<=length;j++) {
			System.out.println(s.substring(i,j));
		}
	}
	
	}
}
