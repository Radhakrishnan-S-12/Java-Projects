package com;

import java.util.ArrayList;

public class StudentDemo {

	public static void main(String[] args) {

		Student s1 = new Student(101,"Raj",6.6);
		Student s2 = new Student(102,"Ram",9.2);
		Student s3 = new Student(103,"Peter",8.8);
		Student s4 = new Student(104,"Sam",8.6);
		Student s5 = new Student(105,"Riya",7.7);
		Student s6 = new Student(101,"Raj",6.6);
		ArrayList<Student> studentsList = new ArrayList<Student>();
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		studentsList.add(s5);
		
		System.out.println(studentsList);
		
		String str1="welcome";
		String str2=new String("welcome");
		
		if(str1.equals(str2)){
			System.out.println("Same String");
		}else{
			System.out.println("Different String");		
		}
		
		if(s1==s6){
			System.out.println("Student Found");
		}else{
			System.out.println("Student Not Found");		
		}
		
		
		
		if(studentsList.contains(s1)){
			System.out.println("Student Found");
		}else{
			System.out.println("Student Not Found");
		}
		
		if(studentsList.contains(s6)){
			System.out.println("Student Found");
		}else{
			System.out.println("Student Not Found");
		}
		
		
		
		
		
		
	}

}
