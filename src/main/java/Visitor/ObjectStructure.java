package Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Удерживает объекты в структуре. Предоставляет интерфейс, позволяющий
// посетителям посещать его элементы.

public class ObjectStructure {
    private List<Element> children = new ArrayList<Element>();

    public void add(Element element) {
        children.add(element);
    }

    public void remove(Element element) {
        children.remove(element);
    }

    public Element getChild(int index) {
        return children.get(index);
    }

    public void acceptAll(Visitor visitor) {
        for (Iterator iterator = children.iterator(); iterator.hasNext();) {
            Element element = (Element) iterator.next();
            element.accept(visitor);
        }
    }
}
