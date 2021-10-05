package Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Readable{
    private List<Chapter> chapters;
    private String name;
    private List<String> authors;


    public Book(String name, List<String> authors, List<Chapter> chapters) {
        this.chapters = chapters;
        this.name = name;
        this.authors = authors;

    }
    public Book(String name, List<String> authors, Chapter... chapters) {
        this.chapters = new ArrayList<>();
        this.chapters.addAll(Arrays.asList(chapters));
        this.name = name;
        this.authors = authors;
    }

    @Override
    public void read() {
        for (Readable c:chapters){
            c.read();
        }
        System.out.println("\t\tbook \"" +name+"\" has read");
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}

