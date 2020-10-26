package Factory;

public class FactoryArr {
    public static void main(String[] args)
    {
        ISort sortFirst = new SortMerge(1, 4, 3, 2, 6, 11, 8, 0, 16, 10);
        sortFirst.sort();
        ISort sortSecond = new SortRadix(1, 4, 7, 2, 5, 8, 15, 0, 6, 9);
        sortSecond.sort();
        ISort sortThird = new SortShell(7, 8, 1, 2, 5, 11, 0, 9, 6, 3);
        sortThird.sort();
    }
}