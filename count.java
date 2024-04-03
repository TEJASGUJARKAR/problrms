public public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 9, 10, 12, 15};

        int evenCount = countEven(arr);
        int oddCount = countOdd(arr);

        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);
    }

    public static int countEven(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOdd(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}{

}
