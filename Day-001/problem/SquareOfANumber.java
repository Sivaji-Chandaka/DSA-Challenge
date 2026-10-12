
import java.util.Scanner;

public class SquareOfANumber {

    public static int squareOfANumber(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Square of a Number ===");

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = squareOfANumber(n);

        System.out.println("Number: " + n);
        System.out.println("Square of " + n + " is: " + result);

        sc.close();
    }
}