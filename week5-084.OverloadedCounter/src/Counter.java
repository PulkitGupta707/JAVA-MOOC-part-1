/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pulkit
 */
public class Counter {
    private int startingValue;
    boolean check; 
    public void increase(int increaseAmount)
    {
        if(increaseAmount>=0)
            startingValue+=increaseAmount;
    }
    public void decrease(int decreaseAmount)
    {
         if(decreaseAmount>0)
         {
             if(check==true)
            {
                if(startingValue>0&&startingValue>decreaseAmount)
                startingValue-=decreaseAmount;
                else 
                    startingValue=0;
            }
            else 
                startingValue-=decreaseAmount;
        }
         
             
        
    }
    public Counter()
    {
       this.startingValue=0;
       this.check=false;
       
    }
    public Counter(int startingValue, boolean check)
    {
          
      this.startingValue=startingValue; 
      this.check=check;
    }
    public Counter(int startingValue)
    {
         this.startingValue=startingValue; 
         
    }
    public Counter(boolean check)
    {
        this.startingValue=0;
      this.check=check;
    }
    public int value()
    {
       return startingValue; 
    }
    public void increase()
    {
       startingValue+=1; 
    }
    public void decrease()
    {
            if(check==true)
            {
                if(startingValue>0)
                startingValue-=1;
                else 
                    startingValue=0;
            }
            else 
                startingValue-=1;
    } 
}
