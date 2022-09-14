package com.java.batch;

public class Swap {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		c = a;
		a = b;
		b = c;
		System.out.println("a = " + a + " and b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + " and b = " + b);
	}
}
