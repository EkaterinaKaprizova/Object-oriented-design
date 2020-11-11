package Adapter;

public class MemoryCard { //карта памяти, которую нельзя вставить в USB-разъем
    public void insert() {
        System.out.println("Карта памяти вставлена в устройство!");
    }

    public void copyData() {
        System.out.println("Данные успешно скопированы на компьютер!");
    }
}
