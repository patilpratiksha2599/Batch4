package com.java.batch;

import java.util.Enumeration;
import java.util.Vector;

public class DemoE {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement(11);
		v.addElement(22);
		v.addElement(33);
		v.addElement(44);
		v.addElement(55);

		System.out.println(v);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			Object nextElement = e.nextElement();
			System.out.println(nextElement);
		}

	}

}
