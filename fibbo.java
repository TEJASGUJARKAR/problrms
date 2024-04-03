public

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci sequence upto " + n + " terms:");
        printFibonacci(n);
    }
    
    public static void printFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        int nextTerm;
        
        System.out.print(firstTerm + " " + secondTerm + " ");
        
        for (int i = 3; i <= n; i++) {
            nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}{

}
