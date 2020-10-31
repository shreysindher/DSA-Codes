//Given an array arr[] of n elements, write a function to search a given element x in arr[].
public class LinearSearch {

    private static int linSearch(int[] arr, int e) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == e)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int e1 = 110, e2 = 6;

        int pos = linSearch(arr, e1);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + pos);
        }
        pos = linSearch(arr, e2);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + pos);
        }
    }
}
