public class BookStore {

	public Book[] getBooks() {

		Book books[] = new Book[4];
		books[0] = new Book(9876543, "C++", 213,"ASSD","CVVVFV");
		books[1] = new Book(9887543, "Core Java",345, "XYZ", "ASDDD");
		books[2] = new Book(1234584, "Python", 1234, "MABC", "ASCDFV");
		books[3] = new Book(9876543, "C", 2555, "QWEEE", "ASDFGGG");

		return books;
	}

	public Book findBookById(long id) {
		Book book = null;
		for (Book obj : getBooks()) {
			if (obj.getISBN() == id) {
				book = obj;
				break;
			}
		}
		return book;
	}

	public Book updateBook(long id, double price) {
		Book book = findBookById(id);
		if (book != null) {
			book.setPrice(price);
		}
		return book;
	}

}