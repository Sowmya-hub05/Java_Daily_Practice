package com.flm;

import java.util.Scanner;

public class LargestSmallest {
	public static void main(String[] args) {
		
		LargestSmallest obj=new LargestSmallest();
		obj.LargestandSmallest();
		
		
	}
	
	void LargestandSmallest() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int w=sc.nextInt();
		long[] n=new long[w];
		for(int i=0;i<w;i++) {
			System.out.println("Enter element "+(i+1)+" -> ");
			n[i]=sc.nextInt();
		}
		for(int i=0;i<w;i++) {
			for(int j=i+1;j<w;j++) {
				if (n[i]>n[j]) {
					long temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		
		System.out.println("Smallest Number is:"+n[0]);
		System.out.println("Largest Number is:"+n[w-1]);
	}
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
