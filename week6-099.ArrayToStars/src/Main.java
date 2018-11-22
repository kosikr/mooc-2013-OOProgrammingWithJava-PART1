
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        String star = "*";
        for (int i = 0; i < array.length; i++) {
            howManyStars(array[i]);
            System.out.println("");
        }

        // write code here
    }

    public static void howManyStars(int howMany) {
        for (int j = 1; j <= howMany; j++) {
            System.out.print("*");
        }

    }
}
