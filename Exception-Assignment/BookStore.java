package com.store;

import com.pojo.Book;

public interface BookStore {
	public  Book[] getBooks();//create an array of 5 objects to store information
	public  Book findBookById(Book []books , long ID); //return the book of matching ID
	public Book findBookByName(Book []books , String name); //return the book of matching name

	public  Book updateBook(Book []books, long ID,double price);//update the bookprice of matching ID
	public  void displayBooks(Book[] books); //display book information
	
}
