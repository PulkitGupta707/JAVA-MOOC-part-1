import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int s = 0;
            for(int d : list)
            {
            s+= d;
            }
            return s;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
         double x;
        int y;
        y=list.size();
        
        x=(double)sum(list)/y;
        return x;
    }

    public static double variance(ArrayList<Integer> list) {
         double sumDiffsSquared = 0.0;
   double avg = average(list);
   for (int value : list)
   {
       double diff = value - avg;
       diff *= diff;
       sumDiffsSquared += diff;
   }
   return sumDiffsSquared  / (list.size()-1);

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
