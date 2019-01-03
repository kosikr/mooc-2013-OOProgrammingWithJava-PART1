/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafal
 */
public class Grade {

    private int[] grades;

    public Grade() {
        this.grades = new int[6];
    }

    public int grade(int score) {

        if (score <= 29) {
            return 0;
        }
        if (score <= 34) {
            return 1;
        }
        if (score <= 39) {
            return 2;
        }
        if (score <= 44) {
            return 3;
        }
        if (score <= 49) {
            return 4;
        }

        return 5;

    }

    public void add(int score) {
        if (score < 0 || score > 60) {
            return;
        }
        int theGrade = grade(score);
        this.grades[theGrade]++;
    }

    public void print() {
        System.out.println("Grade distribution: ");

        for (int i = this.grades.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + printStars(grades[i]));
        }
        System.out.println("Acceptance percentage: " + acceptancePercentage());
    }

    public double acceptancePercentage() {
        double totalScore = 0;
        double failed = grades[0];
        for (int grade : grades) {
            totalScore += grade;
        }
        return 100 * (totalScore - failed) / totalScore;
    }

    public String printStars(int n) {
        String starContainer = "";
        for (int i = 0; i < n; i++) {
            starContainer += "*";

        }
        return starContainer;
    }
}
