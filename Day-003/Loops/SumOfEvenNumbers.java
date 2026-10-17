
import java.util.Scanner;

public class SumOfEvenNumbers {

    public static int sumOfEvenNumbersUpToN(int n) {
        int count = n / 2;
        return (int) ((long) count * (count + 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sum of Even Numbers Up to N ===");

        System.out.print("Enter a positive integer (N): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = sumOfEvenNumbersUpToN(n);

            System.out.println("N = " + n);
            System.out.println("Sum of even numbers up to " + n + " = " + result);
        }

        sc.close();
    }
}
