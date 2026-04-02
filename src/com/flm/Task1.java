package com.flm;

public class Task1 {
	public static void main(String[] args) {
		int m=108;
		System.out.println((m>90 && m<=100)?"Grade A":(m>70 && m<=90)?"Grade B":(m>50 && m<=70)?"Grade C":(m<=50 && m>=0)?"Fail":"Invalid");
	}
}
