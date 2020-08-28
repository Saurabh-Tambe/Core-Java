package com.operations;

import java.util.ArrayList;
import java.util.List;

import com.io.EmpIoImpl;
import com.io.empIO;
import com.pojo.Employee;

public class EmpOpImpl implements EmpOperation {
EmpIoImpl emp=new EmpIoImpl();
List<Employee> employees=new ArrayList<Employee>();
	@Override
	public boolean addEmployee(Employee employee) {
		employees= emp.readFromFile();
		
		if(employees==null)
			employees=new ArrayList<Employee>();
		
		employees.add(employee);
		boolean res= emp.addToFile(employees);
		if(res==true)
		{
			return true;
		}
		
		return false;
	}
	
 
	

	@Override
	public Employee updateEmployee(int id, String name) {
		Employee emp1 = null;
		employees= emp.readFromFile();
		if(employees==null)
			return emp1;
		for(Employee employee : employees)
		{
			if (employee.getEmpId()==id)
			{
				employee.setEmpName(name);
				emp1=employee;
				break;
			}
		}
		if(emp1!=null)
		{
			emp.addToFile(employees);
		}
		return emp1;
	}
 
	
	@Override
	public Employee deleteEmployee(int id) {
		Employee emp1 = null;
		employees= emp.readFromFile();
		if(employees==null)
			return emp1;
		for(Employee employee : employees)
		{
			if (employee.getEmpId()==id)
			{
				emp1=employee;
				employees.remove(employee);
				break;
			}
		}
		if(emp1!=null)
		{
			emp.addToFile(employees);
		}
		return emp1;
	}

	@Override
	public Employee findEmployeeById(int id) {
		Employee emp1 = null;
		employees= emp.readFromFile();
		if(employees==null)
			return emp1;
		for(Employee employee : employees)
		{
			if (employee.getEmpId()==id)
			{
				emp1=employee;
				break;
			}
		}
		return emp1;
	}

	@Override
	public void findAllEmployees() {
		employees= emp.readFromFile();
		if(employees==null)
			System.out.println("no employees found");
		else{
		for(Employee employee : employees)
		{
			emp.displayToUser(employee);
		}
			
		}
		 
	}
	

	 
 
}
