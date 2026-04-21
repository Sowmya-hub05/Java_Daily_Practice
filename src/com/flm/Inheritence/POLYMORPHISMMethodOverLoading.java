package com.flm.Inheritence;



public class POLYMORPHISMMethodOverLoading {
	
		String a="sowmya";
		String b="Pendota";
		public static void main(String[] args) {
			
			POLYMORPHISMMethodOverLoading obj=new POLYMORPHISMMethodOverLoading();
			obj.add(2,3);
			obj.add(1,9,7);
			obj.add(2,"hi");
			obj.add("hello",3);
		
			
			
		}
		
		
		
		void add(int a,int b) {
			System.out.println(a+b);
		}
		
		void add(int a,int b, int c) {
			System.out.println(a+b+c);
		}
		
		
		void add(String a, String b) {
			System.out.println(a+b);
		}
		 
		
		void add(int a, String b) {
			System.out.println(a+b);
		
		}
		
		
		void add(String b, int a) {
			System.out.println(a+b);
		}
		
		
		
		

	}



