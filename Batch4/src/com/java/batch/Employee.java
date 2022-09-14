package com.java.batch;

public class Employee extends AbstractDemo {

	private String name;
	private String cName;
	private String desi;
	private double salary;

	public Employee(String name, String cName, String desi, double salary) {
	
		this.name = name;
		this.cName = cName;
		this.desi = desi;
		this.salary = salary;
	}
	
	

	public Employee() {
	
	}



	void display() {
		System.out.println(name + cName + desi + salary);
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Amit", "Persi", "Engg", 40000.00d);
		Employee e2 = new Employee("Amit", "Persi", "Engg", 40000.00d);
		Employee e3 = new Employee("Amit", "Persi", "Engg", 40000.00d);
		Employee e4 = new Employee("Amit", "Persi", "Engg", 40000.00d);

		e1.display();
		e2.display();
		e3.display();
		e4.display();
		
		DemoConstructor d = new DemoConstructor();
		
		Employee employee = new Employee();
		
	}

	@Override
	public void method1() {
		System.out.println("Java");
		
	}

}
