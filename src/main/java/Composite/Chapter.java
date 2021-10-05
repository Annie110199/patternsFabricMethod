package Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chapter implements Readable {
    private List<Page> pages;
    private int startNumber;
    private String name;



    public Chapter(int startNumber, String name, List<Page> pages) {
        this.pages = pages;
        this.startNumber = startNumber;
        this.name = name;
    }
    public Chapter(int startNumber, String name, Page... pages) {
        this.pages = new ArrayList<>();
        this.pages.addAll(Arrays.asList(pages));
        this.startNumber = startNumber;
        this.name = name;
    }
    @Override
    public void read() {
        for (Readable p : pages) {
            p.read();
        }
        System.out.println("\tchapter  \""  + name + "\" has read");
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(int startNumber) {
        this.startNumber = startNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
