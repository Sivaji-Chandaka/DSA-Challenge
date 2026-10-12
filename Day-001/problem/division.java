
import java.util.Scanner;

public class division {

    public static double divideTwoNumbers(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Division of Two Numbers ===");

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            double result = divideTwoNumbers(a, b);
            System.out.println("Result of division: " + result);
        }

        sc.close();
    }
}