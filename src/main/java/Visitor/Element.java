package Visitor;

//Определяет операцию Accept, которая принимает посетителя в качестве аргумента.
public interface Element {
    void accept(Visitor visitor);
}
