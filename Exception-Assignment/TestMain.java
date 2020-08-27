 
import java.util.Scanner;

import com.exception.BookNotFoundException;
import com.pojo.Book;
import com.store.BookStoreImpl;

public class TestMain {

	public static void main(String[] args) {
	 
   Scanner sc=new Scanner (System.in);
		
		BookStoreImpl bookStore = new BookStoreImpl();
		com.pojo.Book[] books = bookStore.getBooks();

	/*	for (com.pojo.Book obj : books) {
			obj.display();
		}

		System.out.println();*/
		
		 
		
		System.out.println("1. find by id\n 2. findByName\n 3. update price \n4. display all \n5.Exit");
		
      int ch;
      Book b;
	do{  
    	  System.out.println("Enter Choice:");
          ch=sc.nextInt();
     
        switch(ch)
        {
        case 1:
        	System.out.println("Enter ISBN:");
        	long id=sc.nextLong();
        	b=bookStore.findBookById(books,id);
        	
            if(b.getISBN() != 0)
	        	 System.out.println("The details of the book are : \n"+b);
	         else {
	        	 try{
						throw new BookNotFoundException("Book Not Found!!");  

				} catch (BookNotFoundException e) {
				 
				    e.printStackTrace();
				    }
	         }
	        	 
	         
	         break;
        	
        	
        	
        	
        	
        	
        	
        case 2:
        	System.out.println("Enter Name:");
        	String name=sc.next();
        	b =bookStore.findBookByName(books,name);
        	
             if(b.getName() != null)
			     System.out.println("The details of the book are : \n"+b);
			 else
			 {
				 try{
						throw new BookNotFoundException("Book Not Found!!");

				} catch (BookNotFoundException e) {
					 
				    e.printStackTrace();
				    }
			 }
			     
	         
	         break;
        case 3:
        	System.out.println("Enter ID:");
        	long id1= sc.nextLong();
        	System.out.println("Enter New Price:");
        	double price=(double)sc.nextDouble();
        	b=bookStore.updateBook(books,id1,price);
        	
        	 
        	
        	 
	         if(b.getISBN()!=0)
	        	 System.out.println("The details of the book are : \n"+b);
	         else {
	        	 try{
						throw new BookNotFoundException("Book Not Found!!");

				} catch (BookNotFoundException e) {
					 
				    e.printStackTrace();
				    }
	         }
	         
	         break;
        case 4:
        	
        	 System.out.println("The details of all the books :- ");
        	 bookStore.displayBooks(books);
		        
		        break;

        case 5: System.exit(0);
        
        }
		
      }while(ch!=5);
	}

	 
}
