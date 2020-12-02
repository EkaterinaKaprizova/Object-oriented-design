package Memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState(1);

        System.out.println(originator.getState());

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState(2);
        System.out.println(originator.getState());

        originator.setMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
