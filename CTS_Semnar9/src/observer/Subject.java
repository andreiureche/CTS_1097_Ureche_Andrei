package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    public List<IObserver> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObserver(String mesaj) {
        for (IObserver observer : observers) {
            observer.primesteNotificare(mesaj);
        }
    }
}
