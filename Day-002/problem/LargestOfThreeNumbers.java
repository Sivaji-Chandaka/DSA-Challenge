
import java.util.Scanner;

class largestOfThreeNumbers {

    public static int largestOfThreeNumbers(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int result = largestOfThreeNumbers(a, b, c);

        System.out.println("The largest number is: " + result);

        sc.close();
    }
}
