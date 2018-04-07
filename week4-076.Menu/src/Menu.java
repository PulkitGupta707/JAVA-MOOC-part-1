
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }
    public void addMeal(String meal)
    {
        
          boolean b=true;
         while(b)
        {
          
           for(String word:this.meals)
           {
            if(meal.equals(word))
            {
                b=false;
                break;
            }
           }
            if(b)
                this.meals.add(meal);
    }
    }
    public void printMeals()
    {
        for(String m:this.meals)
            System.out.println(m);
    }
    public void clearMenu()
    {
        meals.clear();
    }
    // add the methods here
}
