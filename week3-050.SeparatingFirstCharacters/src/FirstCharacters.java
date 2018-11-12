
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int i = 1;
        int j = 0;
        while (i <= 3) {
            if (name.length() >= 3) {
                System.out.println(i + ". character: " + name.charAt(j));
                i++;
                j++;
            } else {
                break;
            }
        }
    }
}
