
import java.util.Scanner;

class UppercaseLowercaseOrDigit {

    public static String uppercaseLowercaseOrDigit(String ch) {
        char c = ch.charAt(0);

        if (Character.isUpperCase(c)) {
            return "Uppercase";
        } else if (Character.isLowerCase(c)) {
            return "Lowercase";
        } else if (Character.isDigit(c)) {
            return "Digit";
        } else {
            return "Special Character";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String ch = sc.next();

        String result = uppercaseLowercaseOrDigit(ch);

        System.out.println("Character type: " + result);

        sc.close();
    }
}
