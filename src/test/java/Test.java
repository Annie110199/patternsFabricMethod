import Composite.Book;
import Composite.Chapter;
import Composite.Composite;
import Composite.Page;
import Fabric.Dialog;
import Fabric.SortTypes;
import adapter.Book2;
import adapter.Bookshelf;
import decorator.ReadableDecorator;
import observer.EventManager;
import observer.Subscriber;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class Tests {
    @Test
    public void Test1Fabric() {
        int[] arr = new int[]{5, 12, 7, 0};

        arr = Dialog.sortArray(arr, SortTypes.SORT1);
        for (int e : arr) {
            System.out.print(e + " ");
        }

        arr = new int[]{5, 12, 7, 0};

        arr = Dialog.sortArray(arr, SortTypes.SORT3);
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }


    private static Book book;
    private static Book book2;
    private static Book book3;

    @Test
    public void Test2Composite() {
        List<String> authors = new ArrayList<>();

        authors.add("kitty");

        Page page1 = new Page("meow1", 1);
        Page page2 = new Page("meow2", 2);
        Page page3 = new Page("meow3", 3);
        Page page4 = new Page("meow", 4);


        Chapter chapter1 = new Chapter(1, "1", page1, page2);
        Chapter chapter2 = new Chapter(3, "2", page3, page4);


        book = new Book("book of kitty", authors,
                chapter1, chapter2);



        List<String> authors1 = new ArrayList<>();
        authors1.add("dog");
        Page page11 = new Page("bark1", 1);
        Page page12 = new Page("bark2", 2);
        Chapter chapter11 = new Chapter(1, "1", page11, page12);
        book2 = new Book("book of dog", authors,
                chapter11);

        List<String> authors2 = new ArrayList<>();
        authors2.add("dog");
        authors2.add("cat");
        book3 = new Book("book of dog and cat", authors,
                chapter11, chapter1, chapter2);


        Composite composite = new Composite();
        composite.addPages(book);

        for (Page p: composite.getPages()){
            System.out.println(p);
        }
    }

    @Test
    public void Test3Adapter() {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.putBook(book,2);
        bookshelf.putBook(book2, 1);
        bookshelf.putBook(new Book2(book3), 3);

        for(Book b: bookshelf.getBooks()){
            System.out.println(b);
        }



        ReadableDecorator decorator = new ReadableDecorator(book3);
        Subscriber subscriber1 = new Subscriber("Horse");
        Subscriber subscriber2 = new Subscriber("Bird");
        EventManager.subscribe(subscriber1);
        EventManager.subscribe(subscriber2);
        decorator.read();
    }

    @Test
    public void Test4DecoratorAndObserver() {

    }

}
