public class DecreasingCounter {
    private int value,x;  // instance variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.x=valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
       if(this.value!=0)
        this.value--;
       
// write here code to decrease counter value by one
    }
    public void reset()
    {
        this.value=0;
    }
    public void setInitial()
    {
        this.value=x;
    }

    // and here the rest of the methods
}
