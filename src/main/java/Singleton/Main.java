package Singleton;

public class Main {
    public static void main(String[] args)
    {
        Thread threadOne = new Thread(new ThreadOne());
        Thread threadTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threadTwo.start();
    }

    static class ThreadOne implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(123);
            System.out.println(singleton.value);
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance(456);
            System.out.println(singleton.value);
        }
    }
}
