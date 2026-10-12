
import java.util.Scanner;

public class Addition {

    public static int add_two_numbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Addition of Two Numbers ===");
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int result = add_two_numbers(a, b);

        System.out.println("Sum of two numbers: " + result);

        sc.close();
    }
}