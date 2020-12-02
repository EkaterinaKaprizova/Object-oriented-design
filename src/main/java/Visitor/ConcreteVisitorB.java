package Visitor;

public class ConcreteVisitorB implements Visitor{
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        concreteElementA.operationA();
    }

    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        concreteElementB.operationB();
    }
}
