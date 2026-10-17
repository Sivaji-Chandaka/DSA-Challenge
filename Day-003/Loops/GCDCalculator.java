
import java.util.Scanner;

public class GCDCalculator {

    public static int gcdOfTwoNumbers(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== GCD of Two Numbers ===");

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int result = gcdOfTwoNumbers(a, b);

        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        System.out.println("GCD = " + result);

        sc.close();
    }
}
