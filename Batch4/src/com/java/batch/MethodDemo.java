package com.java.batch;

class Adder implements Inter {
	static void add(int a, int b) {
		System.out.println(a+b);
	}

	static double add(double a, int b) {
		return a + b;
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int method2() {
		// TODO Auto-generated method stub
		return 0;
	}
}

public class MethodDemo {
	public static void main(String[] args) {
		System.out.println();
		Adder.add(11, 11);
	
	}
}
