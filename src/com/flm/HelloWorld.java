package com.flm;
import com.flm.Database.Database;

public class HelloWorld {
	int a=10;
	public static void main(String[] args) {
		int score=5;
		System.out.println("Hello World!");
		HelloWorld h=new HelloWorld();
		System.out.println(h.a);
		System.out.println(score);
		Database.hi();
		Database d=new Database();
		System.out.println(d.data);
		}
	}

