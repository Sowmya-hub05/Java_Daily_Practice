package com.flm;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		System.out.println("Here's the MENU of AMOGHAM");
		System.out.println("1.Chicken 65");
		System.out.println("2.Panner");
		System.out.println("3.Biryani");
		Scanner sc=new Scanner(System.in);
		System.out.println("Which one do you want to order? Please Enter the Number of the Item: ");
		int item=sc.nextInt();
		switch(item) {
		case 1:
			System.out.println("Your chicken 65 is all yours!");
			break;
		case 2:
			System.out.println("Veggie Veggie Have your Panner!");
			break;
		case 3:
			System.out.println("Biryani is LOVEEEEEE....Coming ur wayy");
			break;
		default:
			System.out.println("OH SORRY! Invalid Input. Enter the correct Number in the list AGAIN");
		}
		
		
	}

}
