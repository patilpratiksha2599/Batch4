package com.java.batch;

public class DemoCont {

	private int a;
	private int b;

	public DemoCont(int a, int b) {
		
		this.a = a;
		this.b = b;
		System.out.println(a + " " + b);
	}

	public DemoCont() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		DemoCont d = new DemoCont();

		System.out.println(d.a);
		System.out.println(d.b);

		DemoCont d1 = new DemoCont(11, 22);

		d1.DemoCont1(101, "India");
	}

	void DemoCont1(int a, String s) {
		System.out.println("Hi " + a);
		System.out.println("Bye " + s);
	}
	
	public DemoCont method() {
		
		DemoCont demoCont = new DemoCont();
		
		return this;
		
	}

}
