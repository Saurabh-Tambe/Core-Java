package com.store;

import java.util.Scanner;

import com.pojo.Book;

public class BookStoreImpl implements BookStore {
Scanner sc=new Scanner(System.in);
	@Override
	public Book[] getBooks() {
		Book books[] = new Book[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter ISBN");
			long isbn=sc.nextInt();
			System.out.println("Enter Book Name");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter Price");
			double price=sc.nextDouble();
			System.out.println("Enter Publication");
			sc.nextLine();
			String publication=sc.nextLine();
			System.out.println("Enter Author");
			sc.nextLine();
			String author=sc.nextLine();
			books[i] = new Book(isbn,name,price,publication,author);
			 
		}
		return books;
		 
	}
	
	 

	@Override
	public Book findBookById(Book[] books, long ID) {
		Book book = null;
		for (Book obj : books) {
			if (obj.getISBN() == ID) {
				book = obj;
				break;
			}
		}
		return book;
	}

	@Override
	public Book findBookByName(Book[] books, String name) {
		Book book = null;
		for (Book obj : books) {
			if (obj.getName() == name) {
				book = obj;
				break;
			}
		}
		return book;
	}

	@Override
	public Book updateBook(Book[] books, long ID, double price) {
		Book book = findBookById(books,ID);
		if (book != null) {
			book.setPrice(price);
		}
		return book;
	}

	@Override
	public void displayBooks(Book[] books) {
		 for (Book b: books) {
			   System.out.println(b);
			   b.toString();
		   }
		
	}

}
