package Factory;

import java.util.ArrayList;
import java.util.List;

public class SortRadix implements ISort {
    private int[] array;

    public SortRadix(Integer... array1) {
        array =new int[array1.length];
        for (int i = 0; i <array1.length; i++) {
            array[i]=array1[i];
        }
    }

    @Override
    public void sort() {

        List<Integer>[] buckets = new ArrayList[10];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }

        boolean flag = false;
        int tmp = -1, divisor = 1;
        while (!flag) {
            flag = true;
            for (Integer i : array) {
                tmp = i / divisor;
                buckets[tmp % 10].add(i);
                if (flag && tmp > 0) {
                    flag = false;
                }
            }
            int a = 0;
            for (int b = 0; b < 10; b++) {
                for (Integer i : buckets[b]) {
                    array[a++] = i;
                }
                buckets[b].clear();
            }
            divisor *= 10;
        }
    }
}