
import java.util.Scanner;

public class RectangleAreaCalculator {

    public static int areaOfRectangle(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Area of a Rectangle ===");

        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        int area = areaOfRectangle(length, breadth);

        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of the rectangle: " + area);

        sc.close();
    }
}