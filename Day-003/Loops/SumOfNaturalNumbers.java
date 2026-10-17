
import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int sumOfFirstNNaturalNumbers(int n) {
        return (int) ((long) n * (n + 1) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sum of First N Natural Numbers ===");

        System.out.print("Enter a natural number (N): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int result = sumOfFirstNNaturalNumbers(n);

            System.out.println("N = " + n);
            System.out.println("Sum of first " + n + " natural numbers = " + result);
        }

        sc.close();
    }
}
