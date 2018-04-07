/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pulkit
 */
public class Multiplier {
    private int y;
   public Multiplier(int number)
   {
        this.y=number;
   }
   public int multiply(int otherNumber)
   {
       int x=otherNumber*y;
       return x;
       
   }
    
}
