
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int i = 1;
        int j = name.length();
        System.out.print("In reverse order: ");
        while (i <= j) {
            System.out.print(name.charAt(j - 1));
        j--;
        }
        System.out.println();
    }
}
