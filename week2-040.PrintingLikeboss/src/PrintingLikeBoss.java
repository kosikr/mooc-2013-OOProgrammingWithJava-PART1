
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int j = 0;
        while (j < amount) {
            System.out.print(" ");
            j++;
        }
    }

    public static void printTriangle(int size) {
        int k = size - 1;
        int m = 1;
        while (k >= 0) {
            printWhitespaces (k);
            k--;
            printStars(m);
            m++;
        }
    }

    public static void xmasTree(int height) {
        int n = height - 1;
        int p = 1;
        while ( n >= 0) {
            printWhitespaces (n);
            n--;
            printStars(p);
            p += 2;
        }
        printWhitespaces (height - 2);
        printStars (3);
        printWhitespaces (height - 2);
        printStars (3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
