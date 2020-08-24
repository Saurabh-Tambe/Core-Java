public class BookTest {

	public static void main(String[] args) {

		BookStore bookStore = new BookStore();
		Book books[] = bookStore.getBooks();

		for (Book obj : books) {
			obj.display();
		}

		System.out.println();

		Book book = bookStore.findBookById(123);
		if (book != null) {
			System.out.println("Book found ");
			book.display();
		} else {
			System.out.println("Book not found ");
		}

		System.out.println();
		book = bookStore.updateBook(9876543, 455);
		if (book != null) {
			System.out.println("Book price update ");
			book.display();
		} else {
			System.out.println("Book not found ");
		}

	}

}