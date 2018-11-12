
public class Least {

    public static int least(int number1, int number2) {
        if (number1 <= number2) {
            int least = number1;
            return least;
        } else {
            int least = number2;
return least;
        }

// write program code here
        // do not print anything inside the method
        // method needs a return in the end
        
    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
