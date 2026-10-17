
import java.util.Scanner;

public class  QuadrantOfAPoint{

    public static int quadrantOfAPoint(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Quadrant of a Point ===");

        System.out.print("Enter the x-coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter the y-coordinate: ");
        int y = sc.nextInt();

        int result = quadrantOfAPoint(x, y);

        System.out.println("\nPoint: (" + x + ", " + y + ")");

        if (result == 0) {
            System.out.println("The point lies on an axis or at the origin.");
        } else {
            System.out.println("The point lies in Quadrant " + result + ".");
        }

        sc.close();
    }
}
