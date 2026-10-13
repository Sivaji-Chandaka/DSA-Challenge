
import java.util.Scanner;

class VowelOrConsonant {

    public static boolean vowelOrConsonant(String ch) {
        ch = ch.toLowerCase();

        return ch.equals("a") || ch.equals("e") ||
               ch.equals("i") || ch.equals("o") ||
               ch.equals("u");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String ch = sc.next();

        boolean result = vowelOrConsonant(ch);

        if (result) {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is a consonant");
        }

        sc.close();
    }
}
