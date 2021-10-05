package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite {
    private List<Page> pages = new ArrayList<>();
    public List<Page> addPages(Book book){
        for (Chapter c: book.getChapters()){
            for (Page p: c.getPages()) {
                pages.add(p);
            }
        }
        return pages;
    }
    public List<Page> addPages(Chapter c){
        pages.addAll(c.getPages());
        return pages;
    }

    public List<Page> getPages() {
        return pages;
    }
}
