package Observer;

public class ConcreteObserver implements Observer {

    private int observerState;

    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    public void update() {
        observerState = subject.getState();
    }

    protected int getObserverState() {
        return observerState;
    }
}
