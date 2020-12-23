package com;

import java.util.ArrayList;

public class StudentDemo {

	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		ArrayList<Student> slist = dao.getAllStudents();
		for(Student s:slist){
			System.out.println(s);
		}
		
		Student st = new Student(201,"A",6.6,"CSE");
		dao.addStudent(st);
		
		slist = dao.getAllStudents();
		for(Student s:slist){
			System.out.println(s);
		}
		
		
		
	}

}
