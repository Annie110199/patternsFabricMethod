package adapter;

import Composite.Book;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private List<Book> books = new ArrayList<>();

    public List<Book> putBook(Book book, int quantity) {
        for (int i = 0; i < quantity; i++) {
            books.add(book);
        }
        return books;
    }
    public List<Book> putBook(Book2 book, int quantity) {
        for (int i = 0; i < quantity; i++) {
            books.add(book.getBook());
        }
        return books;
    }

    public List<Book> getBooks() {
        return books;
    }
}
