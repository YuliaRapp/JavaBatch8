package com.syntax.class04;

public class ClassTask {

	public static void main(String[] args) {

		System.out.println("------------- TASK 1 ---------------");
		/*
		 * Write a program to store a boolean value of whether user has diploma or not.
		 * If user has a diploma, you should say congratulations, otherwise program
		 * should suggest to get a degree. Then if user has a degree program should
		 * check a gpa score. If gpa score is higher or equals to 3.5 → output should
		 * say “You are eligible for scholarship”, otherwise → “You should have studied
		 * harder” .
		 */

		boolean diploma = true;
		double score = 3.8;

		if (diploma) {// if user has dimploma we do further check of gpa

			System.out.println("Congratulation");

			if (score >= 3.5) {
				System.out.println("Your eligible for scholeship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Get a degree");
		}

		System.out.println("------------- TASK 2 ---------------");
		/*
		 * Create a Java program and store values of mortgage rate and mortgage price.
		 * First, program should check if rate is higher than 4.5 user will not buy a
		 * house, otherwise user will consider buying. Once user decides to buy a house,
		 * if price of the house is larger than 200000 than user will take a loan,
		 * otherwise user will pay cash.
		 */

		double morgRate, morgPrice;
		morgRate = 3;
		morgPrice = 12000;

		if (morgRate < 4.5) {
			System.out.println("I am thinking of byuing a house");

			if (morgPrice > 20000) {
				System.out.println("I need to get loan");

			} else {
				System.out.println("I am rich I can pay cash");
			}

		} else {
			System.out.println("I am not buying the house");

		}

	}
}
