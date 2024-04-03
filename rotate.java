public

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotateLeft(arr);

        System.out.println("Array after rotating left by 1 position: " + Arrays.toString(arr));
    }

    public static void rotateLeft(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int firstElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = firstElement;
    }
}{

}
