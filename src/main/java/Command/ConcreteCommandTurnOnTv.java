package Command;

public class ConcreteCommandTurnOnTv implements Command {
    ReceiverTv myTv;

    public void TvOnCommand(ReceiverTv myTv) {
        this.myTv = myTv;
    }

    @Override
    public void execute() {
        myTv.switchOn();
    }
}
