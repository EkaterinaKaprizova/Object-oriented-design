package Command;

public class Main {
    public static void main(String[] args) {
        InvokerRemoteControl remotecontrol = new InvokerRemoteControl();
        ReceiverTv myTv = new ReceiverTv();
        Command tvOn = new ConcreteCommandTurnOnTv();
        Command tvOff = new ConcreteCommandTurnOffTv();
        remotecontrol.setCommand(tvOn);
        remotecontrol.pressButton();

    }
}
