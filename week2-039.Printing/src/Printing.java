public class Printing {

    public static void printStars(int amount) {
        int i = 0;
        while ( i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times        
    }

    public static void printSquare(int sideSize) {
        int side = 0;
        while (side < sideSize) {
            printStars(sideSize);
            side++;
        }
    }

    public static void printRectangle(int width, int height) {
        
        int h = 0;
        while (h < height) {
            printStars(width);
            h++;
        }
    }

    public static void printTriangle(int size) {
        int stars = 1;
        int count = 0;
        while (count < size) {
            printStars(stars);
            stars++;
            count++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
