package adapter;

import Composite.Book;

import java.util.Objects;


public class Book2 implements Adapter {
    private Book book;
    private int ID;

    public Book2(Book book) {
        this.book = book;
        this.ID = hashCode();
    }

    public Book getBook() {
        return book;
    }

    public int getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book2)) return false;
        Book2 that = (Book2) o;
        return getID() == that.getID() &&
                getBook().equals(that.getBook());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBook(), getID());
    }


}
