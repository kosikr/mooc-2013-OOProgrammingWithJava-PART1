/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafal
 */
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine() {
        Random randomno = new Random();

        for (int i = 1; i <= this.width; i++) {
            double randomDouble = randomno.nextDouble();
            if (randomDouble <= this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        for (int j = 1; j <= this.height; j++) {
            printLine();
            System.out.println("");
        }
    }

    public int starsInLastPrint() {
        int numberOfStars = this.starsInLastPrint;
        this.starsInLastPrint = 0;
        return numberOfStars;

    }
}
