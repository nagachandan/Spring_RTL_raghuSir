package com.app;
public class Employee {
	private int id;
	private String ename;
	private double sal;

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return ename;
	}

	public void setName(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", sal=" + sal + "]";
	}

	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.ename = name;
		this.sal = sal;
	}
}


