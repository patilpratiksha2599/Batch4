package com.java.batch;

public class ExceptionDemo {

	public static void main(String[] args) {

		/*
		 * try { int a = 10 / 2; try { String s = null; System.out.println(s.length());
		 * } catch (Exception e) { System.out.println(e.getMessage()); } } catch
		 * (Exception e) { System.out.println(e.getMessage()); }
		 */

		try {
			int a = 10 / 0;
		} catch (NullPointerException e) {
			// TODO: handle exception
		} finally {
			System.out.println("Hello Java");
		}
		System.out.println("Hello Java");
	}
}
