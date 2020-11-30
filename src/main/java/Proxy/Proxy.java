package Proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    public void doOperation() {
        this.realSubject = new RealSubject();
        this.realSubject.doOperation();
    }

    public RealSubject getRealSubject() {
        return realSubject;
    }
}
