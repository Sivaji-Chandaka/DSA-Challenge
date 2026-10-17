
import java.util.Scanner;

public class CountEvenDigits {

    public static int countOfEvenDigitsInANumber(int n) {
        long num = Math.abs((long) n);
        int count = 0;

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            int digit = (int) (num % 10);

            if (digit % 2 == 0) {
                count++;
            }

            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Count Even Digits in a Number ===");

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = countOfEvenDigitsInANumber(n);

        System.out.println("Original number = " + n);
        System.out.println("Count of even digits = " + result);

        sc.close();
    }
}
