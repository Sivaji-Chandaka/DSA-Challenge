
import java.util.Scanner;

public class LCMCalculator {

    public static int lcmOfTwoNumbers(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        long x = Math.abs((long) a);
        long y = Math.abs((long) b);

        long p = x;
        long q = y;

        // Calculate GCD using the Euclidean algorithm
        while (q != 0) {
            long temp = q;
            q = p % q;
            p = temp;
        }

        // Calculate LCM using GCD
        return (int) (x / p * y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== LCM of Two Numbers ===");

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        long result = calculateLcm(a, b);

        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        System.out.println("LCM = " + result);

        sc.close();
    }

    public static long calculateLcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }

        long x = Math.abs((long) a);
        long y = Math.abs((long) b);

        long p = x;
        long q = y;

        while (q != 0) {
            long temp = q;
            q = p % q;
            p = temp;
        }

        return (x / p) * y;
    }
}
