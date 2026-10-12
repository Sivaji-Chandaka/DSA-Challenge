
import java.util.Scanner;

public class AverageCalculator {

    public static double averageOfThreeNumbers(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Average of Three Numbers ===");

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        double average = averageOfThreeNumbers(a, b, c);

        System.out.println("\nFirst number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Third number: " + c);
        System.out.println("Average: " + average);

        sc.close();
    }
}