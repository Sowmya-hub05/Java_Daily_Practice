package com.flm;

import java.util.Scanner;

public class Methid {
	
	public static void main(String[] args) {
		Methid object=new Methid();
		int a=object.add(8,8);
		System.out.println(a);
		
		int v=object.divide(a);
		System.out.println(v);
		
		System.out.println("Enter ur num:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String result=object.Prime(n);
		System.out.println(result);
		
	
	}
	
	
		public int add(int a,int b) {
			int c=a+b;
			return c;
		}
		
		
		public int divide(int q) {
			return q/2;
		}
		
		public String Prime(int a) {
			int count=0;
			String result="";
			for(int i=2;i<=Math.sqrt(a);i++) {
				if(a%i==0) {
					count++;
				}
			}
			if(count>0) {
				return "Not Prime";	
			}
			else {
				return "Prime";
			}	
			
		}
	
	
}
 