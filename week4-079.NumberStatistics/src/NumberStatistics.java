/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pulkit
 */
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {

        amountOfNumbers++;
        sum += number;

        // code here
    }

    public int amountOfNumbers() {
        return amountOfNumbers;

        // code here
    }

    public int sum() {

        return sum;
        // code here
    }

    public double average() {
        double avg = 0;
        if (amountOfNumbers == 0) {
            avg = 0;
        } else {
            avg = (double) ((double) sum / amountOfNumbers);
        }
        return avg;

        // code here
    }

}
