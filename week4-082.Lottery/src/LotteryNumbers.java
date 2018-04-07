import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
     private Random random = new Random();
    private ArrayList<Integer> numbers;
   

    public LotteryNumbers() {
        
        // Draw numbers as LotteryNumbers is created
      
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
    for(int i=0;i<7;)
    {
        int x= random.nextInt(39)+1;
         
             if(!numbers.contains(x))
          {
                 
              numbers.add(x);
              i++;
              
           
          }
    } 
         
        // We'll format a list for the numbers
        
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
       if(numbers.contains(number))
            return true;
       else
           return false;
        
        
        // Test here if the number is already in the drawn numbers
       
    }
}
