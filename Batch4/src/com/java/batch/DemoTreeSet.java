package com.java.batch;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {

		TreeSet t = new TreeSet();
		
		try {
			t.add("A");
			t.add("Y");
			t.add("T");
			t.add("E");
			t.add("B");
			t.add("A");
			t.add(11);
			t.add("W");
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println(t);

	}

}
