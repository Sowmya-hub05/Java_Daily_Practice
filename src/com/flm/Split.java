package com.flm;
import java.util.Arrays;
public class Split {
	public static void main(String[] args) {
		String s="sowmya is good girl";
		
		String[] q=s.split(" ");
		 for(String i:q) {
			 System.out.println(i); // this is one way
		 }
		 System.out.println(Arrays.toString(q)); // this is direct to show the array in console
	}

}
