package com.java.batch;

public class DemoConstructor {
	
	DemoConstructor(){
		this(10);
		System.out.println("Hello");
	}

	DemoConstructor(int a){
		System.out.println(a);
	}
}

class D{
	
	public static void main(String[] args) {
		DemoConstructor d = new DemoConstructor();
	}
	
}
