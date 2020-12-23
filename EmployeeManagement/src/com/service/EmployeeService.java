package com.service;

import java.util.ArrayList;

import com.bean.Employee;

public class EmployeeService {
	
	private ArrayList<Employee> employeeList;
	
	public EmployeeService() {
		this.employeeList = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee emp){
		employeeList.add(emp);
	}
	
	public ArrayList<Employee> getAllEmployees(){
		return employeeList;
	}
	
	public Employee getEmployee(int empId){
		Employee emp = null;
/*		boolean found = false;
		for(int i=0;i<employeeList.size();i++){
			emp = employeeList.get(i);
			if(emp.getEmpId() == empId){
				found = true;
				break;
			}
		}
		if(found==true)
			return emp;
		else 
			return null;*/
		
		for(Employee tmpEmp:employeeList){
			if(tmpEmp.getEmpId()==empId){
				emp = tmpEmp;
				break;
			}
		}
		return emp;
	}
	
	
	public ArrayList<Employee> getEmployeesWithSalaryMoreThan(double salary){
		ArrayList<Employee> tmpEmpList = new ArrayList<Employee>();
		for(Employee emp:employeeList){
			if(emp.getSalary()>salary){
				tmpEmpList.add(emp);
			}
		}
		return tmpEmpList;
	}

}











