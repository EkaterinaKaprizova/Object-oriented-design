package Observer;

public class Main {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        Observer observer = new ConcreteObserver(subject);
        subject.attach(observer);
        subject.setState(1);

        System.out.println(((ConcreteObserver) observer).getObserverState());

        subject.dettach(observer);
        subject.setState(0);

        System.out.println(((ConcreteObserver) observer).getObserverState());
    }
}
