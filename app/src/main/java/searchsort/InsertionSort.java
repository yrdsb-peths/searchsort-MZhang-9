package searchsort;

public class InsertionSort {
    /**
     * Sort the array arr using insertion sort algorithm.
     */
    //1 4 3 2
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
