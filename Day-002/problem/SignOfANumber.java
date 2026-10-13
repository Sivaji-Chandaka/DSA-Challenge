
import java.util.Scanner;

class SignOfANumber {

    public static int signOfANumber(int n) {
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = signOfANumber(n);

        System.out.println("Sign of the number: " + result);

        sc.close();
    }
}
