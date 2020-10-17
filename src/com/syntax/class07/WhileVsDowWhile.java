package com.syntax.class07;

public class WhileVsDowWhile {

	public static void main(String[] args) {
		
		
		System.out.println(" ----------------- WHILE LOOP---------------------");
		int a=20;
		//first we check condition
		while(a<15) {
			System.out.println("Hello");//do smth
			a++;
		}
		
		System.out.println(" ----------------- DO WHILE LOOP---------------------");
		int b=20;
		//first do smth 
		do {
			System.out.println("Hi");
			b++;
		}while(b<15);//then check condition
		
		
		

	}
}
