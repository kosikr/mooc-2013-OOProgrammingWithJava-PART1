
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        while (true) {
            System.out.print("Type the password: ");
            String typedPassword = reader.nextLine();
            if (typedPassword.equals(password)) {
                System.out.println("Right!");
                System.out.println();
                System.out.println("The secret is: what the heck!?");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        // Write your code here
    }
}
