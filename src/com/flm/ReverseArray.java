package com.flm;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		ReverseArray obj=new ReverseArray();
		obj.Reverse();
	}
	
	void Reverse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int w=sc.nextInt();
		long[] n=new long[w];
		for(int i=0;i<w;i++) {
			System.out.println("Enter element "+(i+1)+" -> ");
			n[i]=sc.nextInt();
		}
		long[] r=new long[w];
		for(int i=0;i<w;i++) {
			r[i]=n[w-(i+1)];
		}
		System.out.println();
		System.out.print("Original String is -> ");
		for(int i=0;i<w;i++) {
			System.out.print(n[i]+" ");
		}
		System.out.println();
		System.out.print("Reversed String is -> ");
		for(int i=0;i<w;i++) {
			System.out.print(r[i]+" ");
		}
	}
	
	

	
}
	
	
	
	
	
	
	
	
	

