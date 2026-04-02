package com.flm;

public class LogicalOperators {
	public static void main(String[] args) {
		int a=70;
		int b=20;
		boolean and=a<b && a==10 && a>b; // AND Operator
		System.out.println(and);
		boolean or=a>b || a==0 || a==9; // OR operator
		System.out.println(or);
		System.out.println(!or); // NOT Operator
		System.out.println(a==10?"hi":a>90?"hlo":"iyiyk");
		
		//Task
		
		int marks=52;
		System.out.println(marks>90?"Grade A":marks>70?"Grade B":marks>50?"Grade C":"Fail");
				 
		
		
	}

}
