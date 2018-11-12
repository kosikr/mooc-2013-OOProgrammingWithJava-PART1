
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int counter = 0;
        System.out.print("Guess a number: ");
        int userGuess = Integer.parseInt(reader.nextLine());
        counter++;
        while (userGuess != numberDrawn) {
            if (userGuess > numberDrawn) {
                System.out.println("The number is lesser, guess made: " + counter);
                System.out.print("Guess a number: ");
                userGuess = Integer.parseInt(reader.nextLine());
                counter++;
            } else if (userGuess < numberDrawn) {
                System.out.println("The number is greater, guess made: " + counter);
                System.out.print("Guess a number: ");
                userGuess = Integer.parseInt(reader.nextLine());
                counter++;
            }

            //if (userGuess == numberDrawn) {
            //    System.out.println("Congratulations, your guess is correct!");
            //} else if (userGuess > numberDrawn) {
            //    System.out.println("The number is lesser");
            //} else {
            //    System.out.println("The number is greater");
        }
        System.out.println("Congratulations, your guess is correct!");
        // program your solution here. Do not touch the above lines!

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
