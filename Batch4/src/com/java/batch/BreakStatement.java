package com.java.batch;

public class BreakStatement {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(2 * i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("Value of j : " + j);
				if (j == 3)
					break;
			}
		}
	}

}
