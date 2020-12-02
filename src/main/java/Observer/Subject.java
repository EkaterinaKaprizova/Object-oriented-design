package Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObervers() {
        for (Iterator iterator = observers.iterator(); iterator.hasNext();) {
            Observer observer = (Observer) iterator.next();
            observer.update();
        }
    }
}
