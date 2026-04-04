package com.flm;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter name ");
		String name=sc.next();
		System.out.println(name);
		sc.nextLine();
		System.out.println("enter address ");
		String address=sc.nextLine();
		System.out.println(address);
	}
}
