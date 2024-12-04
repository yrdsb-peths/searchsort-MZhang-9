package searchsort;

public class BinarySearch extends Search {
    /**
     * Find the index of the target element in the sorted array arr using binary
     * search. Return -1 if target is not found in arr.
     */
    @Override
    public int find(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if(target == arr[0]){
            return 0; 
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1;
    }

    

    /**
     * Find the index of the target element in the sorted array arr using binary
     * search recursively. Return -1 if target is not found in arr.
     */
    @Override
    public int recursiveFind(int[] arr, int target) {
        return recursiveBinarySearch(arr, target, 0, arr.length - 1);
    }
    private int recursiveBinarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Target not found
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] < target) {
            return recursiveBinarySearch(arr, target, mid + 1, right); // Right half
        } else {
            return recursiveBinarySearch(arr, target, left, mid - 1); // Left half
        }
    }

}
