package Visitor;

public class Main {
    public static void main(String[] args)
    {
        ObjectStructure objectStructure = new ObjectStructure();

        ConcreteElementA concreteElementA = new ConcreteElementA();
        ConcreteElementB concreteElementB = new ConcreteElementB();

        objectStructure.add(concreteElementA);
        objectStructure.add(concreteElementB);

        ConcreteVisitorA v1 = new ConcreteVisitorA();
        ConcreteVisitorB v2 = new ConcreteVisitorB();

        objectStructure.acceptAll(v1);
        System.out.println(concreteElementA.getCounter());
        System.out.println(concreteElementB.getCounter());

        objectStructure.acceptAll(v2);
        System.out.println(concreteElementA.getCounter());
        System.out.println(concreteElementB.getCounter());

        Element element = objectStructure.getChild(1);
        objectStructure.remove(element);
        objectStructure.acceptAll(v1);
        System.out.println(concreteElementA.getCounter());
        System.out.println(concreteElementB.getCounter());
    }
}
