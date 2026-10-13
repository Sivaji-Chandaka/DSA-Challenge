
import java.util.Scanner;

class EvenOdd {

    public static boolean evenOrOdd(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = evenOrOdd(n);

        if (result) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        sc.close();
    }
}
