package com.operations;

import java.util.List;

import com.pojo.Employee;

public interface EmpOperation {

 
  boolean addEmployee(Employee employee)  ;

  Employee updateEmployee(int id, String name) ;                          


Employee deleteEmployee(int id);                                  
  Employee findEmployeeById(int id);                                    
                                                                              
  void findAllEmployees();     
  
  
  
 
}
