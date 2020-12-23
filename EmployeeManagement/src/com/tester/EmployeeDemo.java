package com.tester;

import java.util.ArrayList;

import com.bean.Employee;
import com.service.EmployeeService;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Raj",50000);
		Employee e2 = new Employee(102,"Ram",80000);
		Employee e3 = new Employee(103,"Prem",60000);
		Employee e4 = new Employee(104,"Riya",40000);
		Employee e5 = new Employee(105,"Reeta",70000);
		
		EmployeeService eserv=new EmployeeService();
		eserv.addEmployee(e1);
		eserv.addEmployee(e2);
		eserv.addEmployee(e3);
		eserv.addEmployee(e4);
		eserv.addEmployee(e5);
		
		ArrayList<Employee> empList = eserv.getAllEmployees();
		for(int i=0;i<empList.size();i++){
			System.out.println(empList.get(i));
		}

		Employee emp = eserv.getEmployee(10);
		if(emp!=null){
			System.out.println("Employee Found"+emp);
		}else{
			System.out.println("Employee Not Found");
		}
		
		ArrayList<Employee> empList2 = eserv.getEmployeesWithSalaryMoreThan(50000);
		for(Employee tmpEmp:empList2){
			System.out.println(tmpEmp);
		}
	}

}
