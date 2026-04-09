package com.flm;

public class Strings {
	public static void main(String[] args) {
		// Using Literals:
		String s="FLM"; // string created using literal
		String b="FLM"; // string created using literal
		System.out.println(s==b); //compares both variables addresses and result is true bcoz the strings are created by using literals. 
		System.out.println(s.equals(b)); // compares both variables all characters and result is true
		
		// using Object
		String s1= new String("FLM");
		String s2=new String("FLM");
		System.out.println(s1==s2); //compares both variables addresses and result is false bcoz the strings are created by using object.
		System.out.println(s1.equals(s2)); // compares both variables all characters and result is true
	}
}
