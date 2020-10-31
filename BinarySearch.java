import java.util.Arrays;

/*
 * Search a __sorted__ array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array.
 * If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
 * Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
 */
public class BinarySearch {

    private static int binSearch(int[] arr, int l, int r, int key) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (key == arr[mid])
                return mid;
            else if (key < arr[mid])
                return binSearch(arr, l, mid - 1, key);
            return binSearch(arr, mid + 1, r, key);
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 60, 80, 100, 110, 130, 170};
        int key = 110;

        int pos = binSearch(arr, 0, arr.length - 1, key);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + pos);
        }
    }
}
