public

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }
}{

}
