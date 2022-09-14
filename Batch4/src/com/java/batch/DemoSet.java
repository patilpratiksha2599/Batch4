package com.java.batch;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();
		
		hashSet.add(12);
		hashSet.add(null);
		hashSet.add(45);
		hashSet.add(12);
		hashSet.add(null);
		hashSet.add(12);
		hashSet.add(88);
		
		System.out.println(hashSet);
		
	}
}
