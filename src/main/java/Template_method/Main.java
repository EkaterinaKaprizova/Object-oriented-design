package Template_method;

public class Main {
    public static void main(String[] args) {
        ConcreteClass template = new ConcreteClass();
        System.out.println(template.templateMethod());
    }
}
