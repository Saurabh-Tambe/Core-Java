 
public class Book {

	private long ISBN;
	private String name;
	private double price;
	private String publication;
	private String author;

	public Book() {

	}

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

}
