import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.*/
public class BubbleSort {

    private static int[] bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            if (!flag)
                break;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        HashSet<String> hashSet = new HashSet<>();


        int[] sortedArr = bubbleSort(arr, n);
        for (int v : sortedArr) {
            System.out.println(v);
        }
    }
}
