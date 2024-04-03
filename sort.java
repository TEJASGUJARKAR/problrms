public

import java.util.Arrays;

public class SortHalfArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        sortHalfArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void sortHalfArray(int[] arr) {
        int half = arr.length / 2;
        
        // Sort first half in ascending order
        Arrays.sort(arr, 0, half);

        // Sort second half in descending order
        for (int i = half; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}{

}
