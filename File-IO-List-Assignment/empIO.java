package com.io;

import java.io.IOException;
import java.util.List;

import com.pojo.Employee;

public interface empIO {
	public  boolean addToFile(List<Employee>employees); 
	public   List<Employee> readFromFile();  

	public   Employee readFromUser(); 
	public   void displayToUser(Employee emp);  
}

 