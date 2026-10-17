
import java.util.Scanner;

class AbsoluteValueOfANumber {

    public static int absoluteValueOfANumber(int n) {
        if (n < 0) {
            return -n;
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = absoluteValueOfANumber(n);

        System.out.println("Absolute value: " + result);

        sc.close();
    }
}
