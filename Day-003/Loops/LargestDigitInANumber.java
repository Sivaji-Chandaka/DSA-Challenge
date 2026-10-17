
import java.util.Scanner;

public class LargestDigitInANumber {

    public static int largestDigitInANumber(int n) {
        long num = Math.abs((long) n);
        int largest = 0;

        while (num > 0) {
            int digit = (int) (num % 10);

            if (digit > largest) {
                largest = digit;
            }

            num /= 10;
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Largest Digit in a Number ===");

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = largestDigitInANumber(n);

        System.out.println("Original number = " + n);
        System.out.println("Largest digit = " + result);

        sc.close();
    }
}
