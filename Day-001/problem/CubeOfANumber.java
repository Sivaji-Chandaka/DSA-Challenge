
import java.util.Scanner;

public class CubeOfANumber {

    public static int cubeOfANumber(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Cube of a Number ===");

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = cubeOfANumber(n);

        System.out.println("Number: " + n);
        System.out.println("Cube of " + n + " is: " + result);

        sc.close();
    }
}