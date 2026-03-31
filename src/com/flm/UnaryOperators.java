package com.flm;

public class UnaryOperators {
	public static void main(String[] args) {
		short a=-2;

		System.out.println(+a);
		System.out.println(-a);
		
		// not operator
		
		boolean c=true;
		boolean d=false;
		System.out.println(!c);
		System.out.println(!d);
		
		//Increment operator
		
		short i=5;
		System.out.println(i);
		System.out.println(i++); // POST Increment
		System.out.println(i);
		short j=10;
		System.out.println(j);
		System.out.println(++j); // PRE Increment
		System.out.println(j);
		
		
		
		//Decrement Operator
		
		short k=7;
		System.out.println(k);
		System.out.println(k--); // POST Decrement
		System.out.println(k);
		short l=8;
		System.out.println(l);
		System.out.println(--l); // PRE Decrement
		System.out.println(l);
		
		//mixing both
		
		short q=5;
		short w=10;
		System.out.println(q++ + --w - ++q);
	}

}
