package Template_method;

public abstract class AbstractClass {
    /**
     Шаблонный метод, реализация алгоритма которого состоит из
     * * примитивных операций
     *
     * @return результат примитивных операци
     */
    public String templateMethod() {
        return this.primitiveOperation1() + this.primitiveOperation2();
    }

    abstract String primitiveOperation1();

    abstract String primitiveOperation2();
}

