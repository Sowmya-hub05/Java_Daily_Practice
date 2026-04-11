package com.flm;

public class StringMethods {
	public static void main(String[] args) {
		String s1="FLM";
		String s2="FLMEdutech";
		System.out.println(s1.length()); // length
		System.out.println(s1.charAt(0)); // gives character at given index
		
		String s3=" ";
		System.out.println(s3.isEmpty()); // check if it is empty
		System.out.println(s3.isBlank()); // check if it is blank means neglecting spaces
		
		
		String a="FLM";
		String b="flm";
		System.out.println(a.equals(b)); // check if all the characters for both strings same 
		System.out.println(a.equalsIgnoreCase(b)); // check if all the characters for both strings same ignoring the case
		
		
		System.out.println(s2.contains(s1)); // check if a string or character is substring of other
		
		System.out.println(a.startsWith("F")); // check if it is starts with
		System.out.println(a.endsWith("M")); // check if it is ends with
		
		System.out.println(a.indexOf('L')); // gives index for given character
		
		String q="queen";
		System.out.println(q.lastIndexOf('e')); // gives index for given character occuring at last
		
		
		// ***SUB STRING*** //
		
		String i="ManiDeep";
		System.out.println(i.substring(0,4));
		System.out.println(i.substring(4));
		System.out.println(i.substring(0,1));
		
	}

	

}
