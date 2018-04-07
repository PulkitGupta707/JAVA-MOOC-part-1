
public class Reformatory {
        private int c = 0;

    public int weight(Person person) 
    {
        this.c++;
        return person.getWeight();

    }

    public void feed(Person person) {
       
        int x=person.getWeight()+1;
        person.setWeight(x);

    }
      public int totalWeightsMeasured(){

        return this.c;

    }

}
