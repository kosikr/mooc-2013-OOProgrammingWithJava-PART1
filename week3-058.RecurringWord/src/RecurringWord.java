
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> word = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String userInput = reader.nextLine();
            if (word.contains(userInput)) {
                System.out.println("You gave the word " + userInput +" twice");
                break;
            }
            word.add(userInput);
                
    }
        
}
}