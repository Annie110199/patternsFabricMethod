package Composite;

public class Page implements Readable {
    private String text;
    private int number;

    public Page(String text, int number) {
        this.text = text;
        this.number = number;
    }

    @Override
    public void read() {
        System.out.println("page "+number+" has read");
    }

    @Override
    public String toString() {
        return "Page{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
