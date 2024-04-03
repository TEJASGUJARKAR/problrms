public

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};

        int[] result = removeDuplicates(arr);

        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (!set.contains(num)) {
                list.add(num);
                set.add(num);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}{

}
