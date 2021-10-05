package observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private static List<Subscriber> subscribers = new ArrayList<>();
//издателем является Декоратор
    public static void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public static void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(){
        for (Subscriber s: subscribers){
            s.seeReading();
        }
    }

}
