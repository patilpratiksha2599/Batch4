package com.java.batch;

import java.util.LinkedList;
import java.util.ListIterator;

public class DemoL {

	public static void main(String[] args) {

		LinkedList<String> l = new LinkedList<String>();
		l.add("Dhoni");
		l.add("Kohli");
		l.add("Sunil");
		l.add("Rahul");
		l.add("Rohit");
		ListIterator<String> list = l.listIterator();

		while (list.hasNext()) {
			String data = list.next();
			if (data.equals("Sunil")) {
				list.set("Ishan");
			} else if (data.equalsIgnoreCase("Rohit")) {
				list.remove();
			}

		}
		System.out.println(l);
	}

}
