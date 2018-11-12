/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafal
 */
public class Counter {

    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.number = startingValue;
    }

    public Counter(boolean check) {
        this.check = check;
    }

    public Counter() {
        this.number = 0;
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        this.number += 1;
    }

    public void decrease() {

        if (this.number > 0 && this.check) {
            this.number--;
        } else if (!this.check) {
            this.number--;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.number = this.number + increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0 && this.check && this.number > 0) {
            this.number -= decreaseAmount;
            if (this.number < 0) {
                this.number = 0;
            }
        } else if (decreaseAmount > 0 && !this.check) {
            this.number -= decreaseAmount;
        }
    }
}
