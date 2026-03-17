package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void publishNews(String news) {
        observers.forEach(e -> {
            e.update(news);
        });
    }

}
