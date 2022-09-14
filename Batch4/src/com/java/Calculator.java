package com.java;

public class Calculator {
	static int c;

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		String sym = "-";
		switch (sym) {
		case "+":
			c = a + b;
			System.out.println(c);
			break; 
		case "-":
			c = a - b;
			System.out.println(c);
		}
	}
}
