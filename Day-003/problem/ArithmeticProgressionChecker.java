
import java.util.Scanner;

public class ArithmeticProgressionChecker {

    public static boolean arithmeticProgressionOfThreeNumbers(int a, int b, int c) {
        return (long) b - a == (long) c - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Arithmetic Progression Checker ===");

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        boolean result = arithmeticProgressionOfThreeNumbers(a, b, c);

        System.out.println("\nFirst number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Third number: " + c);

        if (result) {
            System.out.println("The numbers form an Arithmetic Progression (AP).");
            System.out.println("Common difference: " + ((long) b - a));
        } else {
            System.out.println("The numbers do not form an Arithmetic Progression (AP).");
        }

        sc.close();
    }
}
