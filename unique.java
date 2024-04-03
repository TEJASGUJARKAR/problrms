public

import java.util.HashMap;
import java.util.Map;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 2, 7, 4, 8, 9, 6};
        printUniqueNumbers(arr);
    }

    public static void printUniqueNumbers(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

       
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

       
        System.out.println("Unique numbers in the array:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}{

}
