package decorator;

import Composite.Book;
import Composite.Readable;
import observer.EventManager;

public class ReadableDecorator implements Readable {
    private Readable book;
    private EventManager eventManager;

    public ReadableDecorator(Book book) {
        this.book = book;
        eventManager = new EventManager();
    }
    public void tellAboutReadingBook(){
        System.out.println("I finished reading! ");
        eventManager.notifySubscribers();
    }
    public void read() {
        book.read();
        this.tellAboutReadingBook();
    }
}