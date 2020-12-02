package Strategy;

public class Main {
    public static void main(String[] args)
    {
        Context context = new Context(new ConcreteStrategyA());
        System.out.println(context.contextInterface());

        context = new Context(new ConcreteStrategyB());
        System.out.println(context.contextInterface());

        context = new Context(new ConcreteStrategyC());
        System.out.println(context.contextInterface());
    }
}
