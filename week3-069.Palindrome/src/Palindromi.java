
import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        int i = 1;
        String help = "";
        int length = text.length();
        while (i <= length) {
            help = help + text.charAt(length - 1);
            length--;
        }
        return help;
    }

    public static boolean palindrome(String text) {
      boolean isPalindrome;
        return isPalindrome = text.equals(reverse(text));
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!" + reverse(text) + text);
        } else {
            System.out.println("The text is not a palindrome!" + reverse(text) + text);
        }
    }
}
