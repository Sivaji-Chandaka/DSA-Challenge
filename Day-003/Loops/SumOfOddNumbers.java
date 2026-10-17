
import java.util.Scanner;

public class SumOfOddNumbers {

    public static int sumOfOddNumbersUpToN(int n) {
        int count = (n + 1) / 2;
        return (int) ((long) count * count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sum of Odd Numbers Up to N ===");

        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = sumOfOddNumbersUpToN(n);

            System.out.println("N = " + n);
            System.out.println("Sum of odd numbers up to " + n + " = " + result);
        }

        sc.close();
    }
}
