package State;

//ConcreteState1 реализует поведение, связанное с состоянием Context.
public class ConcreteState1 implements State {

    private boolean handleInvoked = false;

    public void handle() {
        this.handleInvoked = true;
    }

    protected boolean isHandleInvoked() {
        return handleInvoked;
    }
}