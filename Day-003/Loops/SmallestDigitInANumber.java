
import java.util.Scanner;

public class SmallestDigitInANumber {

    public static int smallestDigitInANumber(int n) {
        long num = Math.abs((long) n);
        int smallest = 9;

        if (num == 0) {
            return 0;
        }

        while (num > 0) {
            int digit = (int) (num % 10);

            if (digit < smallest) {
                smallest = digit;
            }

            num /= 10;
        }

        return smallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Smallest Digit in a Number ===");

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = smallestDigitInANumber(n);

        System.out.println("Original number = " + n);
        System.out.println("Smallest digit = " + result);

        sc.close();
    }
}
