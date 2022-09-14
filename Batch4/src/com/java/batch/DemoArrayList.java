package com.java.batch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class DemoArrayList {

	public static void main(String[] args) {

		ArrayList al = new ArrayList(100);

		al.add(11);
		al.add(11);
		al.add(22);
		al.add("Java");
		al.add(1.1);
		al.add(null);

		System.out.println(al.size());
		Collections.synchronizedList(al);

		System.out.println(al);
		
		LinkedList l = new LinkedList();
		
		
		l.add(77);
		l.add(98);
		l.add(7);
		l.add(20);
		l.addFirst(10);
		l.addLast("JAVA");
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.removeLast();	
		System.out.println(l);
		
		LinkedList l1 = new LinkedList();
		l1.addAll(l1);
		/*
		 * for (Integer i : al) { System.out.println(i); }
		 */

	}

}
