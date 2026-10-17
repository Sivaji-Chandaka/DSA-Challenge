
import java.util.Scanner;

public class CountDigitsInANumber {

    public static int countOfDigitsInANumber(int n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;
        long num = Math.abs((long) n);

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Count Digits in a Number ===");

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = countOfDigitsInANumber(n);

        System.out.println("Original number = " + n);
        System.out.println("Number of digits = " + result);

        sc.close();
    }
}
