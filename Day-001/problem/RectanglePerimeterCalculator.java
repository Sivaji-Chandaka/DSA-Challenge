
import java.util.Scanner;

public class RectanglePerimeterCalculator {

    public static int perimeterOfRectangle(int length, int breadth) {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Perimeter of a Rectangle ===");

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        int perimeter = perimeterOfRectangle(length, breadth);

        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        sc.close();
    }
}