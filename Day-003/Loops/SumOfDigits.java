
import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigitsOfANumber(int n) {
        int sum = 0;
        n = Math.abs(n);

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sum of Digits of a Number ===");

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = sumOfDigitsOfANumber(n);

        System.out.println("Original number = " + n);
        System.out.println("Sum of digits = " + result);

        sc.close();
    }
}
