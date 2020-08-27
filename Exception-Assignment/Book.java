package com.pojo;

public class Book {

	private long ISBN;
	private String name;
	private double price;
	private String publication;
	private String author;
 

	public Book(long ISBN, String name, double price) {

		this.ISBN = ISBN;
		this.name = name;
		this.price = price;
	}

	public Book(long ISBN, String name, String publication, String author) {

		this.ISBN = ISBN;
		this.name = name;
		this.publication = publication;
		this.author = author;
	}

	public Book(long ISBN, String name, double price, String publication, String author) {
		super();
		this.ISBN = ISBN;
		this.name = name;
		this.price = price;
		this.publication = publication;
		this.author = author;
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long ISBN) {
		this.ISBN = ISBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void display() {

		System.out.println("ISBN=" + ISBN + ", name=" + name + ", price=" + price + ", publication=" + publication
				+ ", author=" + author );
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + ISBN + ", name=" + name + ", publication=" + publication + ", author=" + author
				+ ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (ISBN != other.ISBN)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publication == null) {
			if (other.publication != null)
				return false;
		} else if (!publication.equals(other.publication))
			return false;
		return true;
	}
	
}
