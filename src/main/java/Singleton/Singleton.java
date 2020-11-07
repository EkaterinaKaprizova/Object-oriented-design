package Singleton;

public class Singleton {
    private static Singleton instance;
    public int value;

    private Singleton(int value) {
        this.value = value;
    }

    public static Singleton getInstance(int value) {
        Singleton res = instance;
        if (res != null) return res;
        synchronized (Singleton.class) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
