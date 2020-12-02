package Memento;

//Memento хранит внутреннее состояние объекта-создателя, защищает от доступа
//других объектов, кроме создателя.
public class Memento {
    private int state;

    public Memento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}
