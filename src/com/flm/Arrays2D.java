package com.flm;

import java.util.Arrays;
public class Arrays2D {
	public static void main(String[] args) {
		String[][] a= new String[2][2];
		a[0][0]="a";
		a[0][1]="b";
		a[1][0]="c";
		a[1][1]="d";
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		for(String[] i:a) {
			System.out.println(Arrays.toString(i));
		}
		
		
	}
}
