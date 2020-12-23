package com;

public class Student {
	private int regNo;
	private String name;
	private double cgpa;
	private String dept;
	public Student() {
		super();
	}
	public Student(int regNo, String name, double cgpa, String dept) {
		super();
		this.regNo = regNo;
		this.name  = name;
		this.cgpa  = cgpa;
		this.dept  = dept;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", cgpa=" + cgpa + ", dept=" + dept + "]";
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + regNo;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (regNo != other.regNo)
			return false;
		return true;
	}
	
	
}
