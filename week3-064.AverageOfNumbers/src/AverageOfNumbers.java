
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int s = 0;
            for(int d : list)
            {
            s+= d;
            }
            return s;
        
    }
    

    public static double average(ArrayList<Integer> list) {
        double x;
        int y;
        y=list.size();
        
        x=(double)sum(list)/y;
        return x;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
