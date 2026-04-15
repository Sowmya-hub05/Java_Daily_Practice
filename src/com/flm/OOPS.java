package com.flm;

public class OOPS {
	public static void main(String[] args) {
		Students s1=new Students();
		s1.name="sowmya";
		s1.marks=7;
		String result=s1.rank(s1.marks);
		System.out.println(result);
		
	}

}
