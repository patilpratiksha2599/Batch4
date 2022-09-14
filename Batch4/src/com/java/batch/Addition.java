package com.java.batch;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		//int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int i = sc.nextInt();
		int k = sc.nextInt();
		System.out.println("******************");
		int j = i + k;
		System.out.println("The add of above no : " + j);
		
		System.out.println(a + b);
	}
}
