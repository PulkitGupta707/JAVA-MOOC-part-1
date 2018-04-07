/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pulkit
 */
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    @Override
    public String toString() {
        return "The card has " + balance + " euros";

        // write code here
    }

    public void payEconomical() {
        // write code here
        if (balance >= 2.50) {
            balance -= 2.50;
        }
        else
            this.balance=balance;

    }

    public void payGourmet() {
        // write code here
        if (balance >= 4.00) {
            balance -= 4.00;
        }
        else
            this.balance=balance;

    }

    public void loadMoney(double amount) {
        double y=balance+amount;
if(amount>0)
{
        if (y>=0&&y<150) {
            balance += amount;
        } else if (y > 150) {
            balance = 150;
        }
}

    }

}
