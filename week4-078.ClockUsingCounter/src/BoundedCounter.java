/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pulkit
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int up) {
        this.upperLimit = up;
        this.value = 0;

    }

    public void next() {
        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public String toString() {
        if (value < 10) {
            return ("0" + this.value);
        } else {
            return ("" + this.value);
        }
// write code here
    }

    public int getValue() {
        return this.value;
        // write here code that returns the value
    }

    public void setValue(int x) {
        if (x >= 0) {

            if (x <= upperLimit) {
                this.value = x;
            }
        }

    }

}
