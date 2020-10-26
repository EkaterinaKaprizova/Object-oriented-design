package AbstractFactory;

public class Main { //основной класс

    public static void main(String[] args) {
        FactoryRect factoryRect1 = new FactoryRect(new Point(0, 0), new Point(1, 1));
        FactoryRect factoryRect2 = new FactoryRect(new Point(5, 5), new Point(7, 9));
        FactoryRect factoryRect3 = new FactoryRect(new Point(0, 0), new Point(1, 7));
        FactoryRect factoryRect4 = new FactoryRect(new Point(4, 0), new Point(10, 8));
        FactoryRect factoryRect5 = new FactoryRect(new Point(1, 3), new Point(2, 6));

        FactoryRound factoryRound1 = new FactoryRound(new Point(0, 0), 1);
        FactoryRound factoryRound2 = new FactoryRound(new Point(5, 5), 3);
        FactoryRound factoryRound3 = new FactoryRound(new Point(0, 0), 7);
        FactoryRound factoryRound4 = new FactoryRound(new Point(4, 0), 8);
        FactoryRound factoryRound5 = new FactoryRound(new Point(2, 3), 6);

        factoryRect1.moveR();
        factoryRect2.resizeR();
        factoryRect3.resizeR();
        factoryRect4.moveR();
        factoryRect5.resizeR();

        factoryRound1.moveR();
        factoryRound2.resizeR();
        factoryRound3.moveR();
        factoryRound4.moveR();
        factoryRound5.resizeR();
    }
}
