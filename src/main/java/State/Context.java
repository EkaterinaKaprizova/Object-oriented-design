package State;

//Контекст поддерживает экземпляр подкласса ConcreteState,
// который определяет текущее состояние.
public class Context {

    private State state;

    public void request() {
        state.handle();
    }

    public void setState(State state) {
        this.state = state;
    }
}
