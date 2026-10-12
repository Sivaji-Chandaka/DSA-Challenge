
import java.util.Scanner;

public class TriangleAreaCalculator {

    public static double areaOfTriangle(int base, int height) {
        return (base * height) / 2.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Area of a Triangle ===");

        System.out.print("Enter the base of the triangle: ");
        int base = sc.nextInt();

        System.out.print("Enter the height of the triangle: ");
        int height = sc.nextInt();

        double area = areaOfTriangle(base, height);

        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area of the triangle: " + area);

        sc.close();
    }
}