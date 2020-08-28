import java.util.Scanner;

import com.io.EmpIoImpl;
import com.operations.EmpOpImpl;
import com.pojo.Employee;

public class TestPerson {
	public static void main(String[] args) {
		
		
		Employee emp=new Employee();
		EmpIoImpl emp1=new EmpIoImpl();
		EmpOpImpl empop=new EmpOpImpl();

		int ch=0;
		Scanner sc=new Scanner(System.in);
		 
			do{
			
			 
			 System.out.println("1.Add Employee \n2.Update Employee \n3.Find by ID\n4.Find All\n5.Exit");
			 System.out.println("Enter Choice:");
			 ch=sc.nextInt();

			 switch(ch)
			 {
			 case 1:
				 emp=emp1.readFromUser();
				 boolean result=empop.addEmployee(emp); 
				 if(result)
					{
						System.out.println("Data added");
					}
					else
					{
						System.out.println("Data not added");
					}
				 break;
				 
				 
				 
				// employee=obj1.readFromUser();
					
			 case 2:
				 
				 System.out.println("Enter id" );
					int id = sc.nextInt();
					System.out.println("Enter name " );
					String name=sc.next().trim();
					emp=empop.updateEmployee(id, name);
					if(emp==null)
						System.out.println("employee not found");
					else
					{
						System.out.println(emp);
						System.out.println("Data updated");
					}
				 break;
				 
			 case 3:
				 System.out.println("Enter the id to find : " );
					int id1 = sc.nextInt();
					emp=empop.findEmployeeById(id1);
					if(emp==null)
						System.out.println("employee not found");
					else
						System.out.println(emp);
				 break;
				 
			 case 4:
				 empop.findAllEmployees();

				 break;
				 
			 case 5: System.exit(0);
				 break;
			 
			 
			 };
			
			//  emp=emp1.readFromUser();
				
			//	emp1.displayToUser(emp);
				
				
				
				
				
				
			}while(ch!=5);
			
			
		 
	  
		
		
		
		
		
		
	}


}
