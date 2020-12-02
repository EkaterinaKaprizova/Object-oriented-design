package State;

public class Main {
    public static void main(String[] args)
    {
        State state1 = new ConcreteState1();
        State state2 = new ConcreteState2();

        System.out.println(((ConcreteState1) state1).isHandleInvoked());
        System.out.println(((ConcreteState2) state2).isHandleInvoked());

        Context context = new Context();
        context.setState(state1);
        context.request();

        System.out.println(((ConcreteState1) state1).isHandleInvoked());

        context.setState(state2);
        context.request();

        System.out.println(((ConcreteState2) state2).isHandleInvoked());
    }
}
