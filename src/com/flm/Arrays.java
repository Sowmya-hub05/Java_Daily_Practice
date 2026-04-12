package com.flm;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
	int[] a= {1,2,3};
	System.out.println(a[0]);
	char[] q= {'a','e','i'};
	System.out.println(q[0]);
	
	Arrays obj=new Arrays();
	obj.sowmya();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of students:");
	int n=sc.nextInt();
	double[] marks=new double[n];
	for(int i=0;i<n;i++) {
		System.out.println("enter marks of "+(i+1)+":");
		double my=sc.nextDouble();
		marks[i]=my;
	}
	for(int i=0;i<n;i++) {
		System.out.println("marks of student "+(i+1)+"->"+marks[i]);
	}
	
	}
	
	void sowmya() {
		String[] s= new String[3];
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
	}
	
	
	

}
