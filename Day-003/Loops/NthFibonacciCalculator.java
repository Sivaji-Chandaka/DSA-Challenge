
import java.util.Scanner;

public class NthFibonacciCalculator {

    public static int nthFibonacciNumber(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Nth Fibonacci Number ===");

        System.out.print("Enter the position (N): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else if (n > 46) {
            System.out.println("Please enter a number between 0 and 46.");
            System.out.println("The Fibonacci number may overflow the int range for larger values.");
        } else {
            int result = nthFibonacciNumber(n);

            System.out.println("Position = " + n);
            System.out.println("Fibonacci number at position " + n + " = " + result);
        }

        sc.close();
    }
}
