package Visitor;
//Объявляет операцию посещения для каждого класса ConcreteElement в
// структуре объекта
public interface Visitor {
    void visitConcreteElementA(ConcreteElementA concreteElementA);
    void visitConcreteElementB(ConcreteElementB concreteElementB);
}
