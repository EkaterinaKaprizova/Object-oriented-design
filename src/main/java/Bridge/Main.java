package Bridge;

public class Main {
    public static void main(String[] args) {
        AbstractShape shape = new Rectangle(new Blue());
        shape.applyColor();

        shape = new Circle(new Red());
        shape.applyColor();
    }
}
