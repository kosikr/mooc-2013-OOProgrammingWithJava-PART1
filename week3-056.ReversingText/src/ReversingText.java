
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
       int i = 1;
        int j = text.length();
        String help = "";
        while (i <= j) {
            help = help + text.charAt(j - 1);
        j--;
      
        }
        return help;
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
      
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
