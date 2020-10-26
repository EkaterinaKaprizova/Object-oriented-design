package Factory;

public class SortShell implements ISort {

    private int[] array;
    public SortShell(Integer... array1) {
        array =new int[array1.length];
        for (int i = 0; i <array1.length; i++) {
            array[i]=array1[i];
        }
    }
    @Override
    public void sort()
    {
        int temp;
        int h = 0; //величина интервала


        while(h <= array.length/3) //вычисляем исходное значение интервала
            h = 3*h + 1;

        for(int k = h; k > 0; k = (k-1)/3)
            for(int i = k; i < array.length; i++)
            {
                temp = array[i];
                int j;
                for(j = i; j >= k; j -= k)
                {
                    if(temp < array[j - k])
                        array[j] = array[j - k];
                    else
                        break;
                }
                array[j] = temp;
            }
    }
}