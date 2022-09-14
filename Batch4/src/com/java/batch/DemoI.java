package com.java.batch;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoI {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		
//		for(int i : al) {
//			System.out.println(i);
//		}
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			Integer next = itr.next();
			itr.remove();
			System.out.println(next);
		}
		
	}

}
