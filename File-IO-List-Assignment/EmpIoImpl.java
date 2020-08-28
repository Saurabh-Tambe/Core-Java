package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pojo.Address;
import com.pojo.Employee;
 

public class EmpIoImpl implements empIO {
	List<Employee> employees=new ArrayList<Employee>();

	Scanner sc=new Scanner(System.in);
	
	@Override
	public Employee readFromUser() {
		 Employee emp=new Employee();
		 Address add=new Address();
		 System.out.println("Enter ID");
		 int id=sc.nextInt();
		 System.out.println("Enter Name");
		 String name=sc.next();
		 System.out.println("Enter City");
		 String city=sc.next();
		 System.out.println("Enter State");
		 String state=sc.next();
		 System.out.println("Enter Pincode");
		 int pin=sc.nextInt();
		 add.setCity(city);
		 add.setState(state);
		 add.setPincode(pin);
		 emp.setEmpId(id);
		 emp.setEmpName(name);
		 emp.setAddress(add);
		return emp;
	}


	@Override
	public List<Employee> readFromFile() {
		 try {
			 FileInputStream fi=new FileInputStream("file1.txt");
			 ObjectInputStream oi=new ObjectInputStream(fi);
	 
		 Object o=null;
		 
		 while(fi.available()!=0)
			{
				o=oi.readObject();
				Employee employee =(Employee) o;
				employees.add(employee);
			}
		// Employee data=(Employee) o;
	//	 System.out.println(data);
	 
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return employees;

	}
	
	
	 
	 

	
	@Override
	public void displayToUser(Employee emp) {
	// System.out.println(emp);
		System.out.println(emp);

	}
	
	
	
	
	@Override
	public boolean addToFile(List<Employee> employees) {
		boolean res=false;
		try (FileOutputStream fo = new FileOutputStream("file1.txt");
				ObjectOutputStream oo = new ObjectOutputStream(fo);) 
		{
 
			for(Employee employee : employees){
				oo.writeObject(employee);}
			res=true;
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
