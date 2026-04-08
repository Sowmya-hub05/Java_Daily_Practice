package com.flm;

import java.util.Scanner;

public class MunberOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur number: ");
		int num=sc.nextInt();
		String result="";
		int count=0;
		while(num>=1) {
			count++;
			num=num/10;
		}
		System.out.println(count);
		
		
	}


}
