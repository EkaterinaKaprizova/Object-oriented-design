package Proxy;

public class Main {
    public static void  main(String[] args)
    {
        Proxy proxy = new Proxy();

        // realSubject is not created yet, therefore we expect null
        System.out.println(proxy.getRealSubject());

        proxy.doOperation();

        System.out.println(proxy.getRealSubject());
    }
}
