
import java.util.Scanner;

class LargerNumber {

    public static int smallestOfTwoNumbers(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int result = smallestOfTwoNumbers(a, b);

        System.out.println("The smallest number is: " + result);

        sc.close();
    }
}
