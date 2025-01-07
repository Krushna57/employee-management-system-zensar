package com.acc.model;

public class Employee {
	int id;
	int age;
	String fname;
	String lname;
	float salary;
	
	
	
	public Employee(int id, int age, String fname, String lname, float salary) {
		super();
		this.id = id;
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}

	public float getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary
				+ "]";
	}
}
