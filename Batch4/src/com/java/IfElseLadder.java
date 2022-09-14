package com.java;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Add : ");
		System.out.println("Enter 2 for Sub : ");
		System.out.println("Enter 3 for Mul : ");
		System.out.println("Enter 4 for Div : ");
		int k = sc.nextInt();
		switch (k) {
		case 1:
			System.out.println("Enter 2 number for add : ");
			int j = sc.nextInt();
			int i = sc.nextInt();
			System.out.println("The add of " + j + " and " + i + " = " + (j + i));
			break;
		default:
			System.out.println("Please provide valid I/P");
		}

	}

}
