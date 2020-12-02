package Command;

public class ConcreteCommandTurnOffTv implements Command {
    ReceiverTv myTv;

    public void TvOffCommand(ReceiverTv myTv) {

        this.myTv = myTv;

    }

    @Override
    public void execute() {
        myTv.switchOff();


    }
}