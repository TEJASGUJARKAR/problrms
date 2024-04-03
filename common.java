public

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {3, 6, 9, 12, 15};

        findCommonElements(arr1, arr2);
    }

    public static void findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        
    
        for (int num : arr1) {
            set.add(num);
        }
        
        System.out.println("Common elements in the arrays:");
       
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.println(num);
            }
        }
    }
}{

}
