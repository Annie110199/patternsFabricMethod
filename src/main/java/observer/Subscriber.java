package observer;

public class Subscriber {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void seeReading(){
        System.out.println("I, "+ name +", know that you finished the book! ");
    }
}
