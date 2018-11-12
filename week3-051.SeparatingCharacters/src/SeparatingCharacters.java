
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int length = name.length();
        int i = 1;
        int j = 0;
        while ( i <= length ) {
            System.out.println(i + ". character: " + name.charAt(j));
            i++;
            j++;
            
        }
    }
}
