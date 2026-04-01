package com.flm;

public class IncrmntDecrmnt {
	public static void main(String[] args) {
		int a=5;
		int b=8;
		// example 1
		int eg1=a-- + ++b - --b + --a;
		System.out.println(eg1);
		// example 2
		int eg2=--b + b++ - a++ - --a;
		System.out.println(eg2);
	}
	

}