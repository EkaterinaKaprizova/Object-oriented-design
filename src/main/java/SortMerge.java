public class SortMerge implements ISort{
    private int[] array;

    public SortMerge(Integer...arr)
    {
        array =new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            array[i]=arr[i];
        }
    }

    @Override
    public void sort()
    {
        mergeSort(array, 0, array.length - 1);
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }

    static void merge(int[] array, int left, int mid, int right) {

        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int[] leftArray = new int [lengthLeft];
        int[] rightArray = new int [lengthRight];

        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }
            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }
}
