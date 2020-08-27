import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.exception.PersonNotFound;
import com.io.PersonImpl;
import com.pojo.Person;

 

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner (System.in);
			List<Person> persons= new ArrayList<Person>();
			PersonImpl person = new PersonImpl();
			//com.pojo.Book[] books = bookStore.getBooks();

			  persons = person.getPersons();

		/*	for (com.pojo.Book obj : books) {
				obj.display();
			}

			System.out.println();*/
			
		try{	 
			
			System.out.println("1. Add Data\n 2. Update Person\n 3. Find Person \n4. display all \n5.Exit");
			
	      int ch;
	      Person p1=new Person();
		do{  
	    	  System.out.println("Enter Choice:");
	          ch=sc.nextInt();
	     
	        switch(ch)
	        {
	        case 1:
	        	System.out.println("Enter ID:");
	        	int id=sc.nextInt();
	        	System.out.println("Enter Name:");
                String name=sc.next();
                 
                 
	        	persons=person.addPerson(persons, new Person(id,name));
	        	
	            
		         
		         break;
	        	
	        	
	        	
	        case 2:
	           	System.out.println("Enter ID:");
	        	int id1=sc.nextInt();
	        	System.out.println("Enter Name:");
                String name1=sc.next();
                p1= person.updatePerson(id1,name1,persons); ;
	        	
	             if(p1.getName() != null)
				     System.out.println("The Updated data: \n"+p1);
				 else
				 {
					throw new PersonNotFound("Person Not Found!!");
				  }
				     
		         
		         break;
	        case 3:
	        	System.out.println("Enter ID:");
	        	int id3= sc.nextInt();
	         
	        	p1=person.findById(id3,persons);
	        	
	        	 
	        	
	        	 
		         if(p1.getId()!=0)
		        	 System.out.println("The Data: \n"+p1);
		         else {
		        	 	throw new PersonNotFound("Person Not Found!!");
		        	  }
		         
		         break;
	        case 4:
	        	
	        	 System.out.println("The details of all person :- ");
	        	 person.displayPersons(persons);
			        
			        break;

	        case 5: System.exit(0);
	        
	        }
			
	      }while(ch!=5);
		}catch (PersonNotFound e) {
			 
		    e.printStackTrace();
		    }
		}

		 
	}