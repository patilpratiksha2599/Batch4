package com.java.batch;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoMap {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();

		m.put(11, "ABC");
		m.put(22, "IJK");
		m.put(33, "PQR");
		m.put(44, "XYZ");
		m.put(44, "XYZ");
		m.put(55, "XYZ");

		for (Map.Entry map : m.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}
System.out.println("*****************************");
		Map<String, Long> m1 = new HashMap<>();

		m1.put("JAVA", 1L);
		m1.put("CPP", 2L);
		m1.put("PYTHON", 3L);
		m1.put("HTML", 4L);
		m1.put(null, 4L);
		m1.put(null, null);
		m1.put("GO", null);

		for (Map.Entry map : m1.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}

	}

}
