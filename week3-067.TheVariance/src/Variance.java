import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int size = list.size();
        double average = (double) sum(list) / size;
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
    double varTotal = 0;
    double d = average(list);
for (int number : list) {
    double var = Math.pow(number - d, 2);
    varTotal += var;
}    
double wynik = varTotal / (list.size()-1);
// write code here
        return wynik;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
