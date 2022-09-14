package com.java;

import java.math.BigDecimal;

public class Class1 {

	String a = "";

	public static void main(String[] args) {
//		Class1 c = new Class1();
//		String s = "JaVa";
//		String s1 = "Program";
//		String l = s.toLowerCase();
//		// System.out.println(lowerCase);
//		System.out.println(s);
//		System.out.println(l);
//		int length = s.length();
//		System.out.println(length);
//		System.out.println(s.charAt(3));
//		System.out.println(s.equals(l));
//		System.out.println(s.equalsIgnoreCase(l));
//		System.out.println(s.equalsIgnoreCase(s1));
//		c.equals(s);

		StringBuffer sb = new StringBuffer("Wel-");
		sb.append("come");
		System.out.println(sb);
			
		double b = -13524564640.21440000d;
		
String string = BigDecimal.valueOf(b).abs().toString();
		
		System.out.println(string);
		

	}

	protected void moethod1() {
		System.out.println("Welcome");
	}
}
