import java.util.ArrayList;

public class NumberOfItems {
    public static int countItems(ArrayList<String> x)
    {
        int c=0;
    for(String y:x)
    {
        c++;
    }
    return c;
    }
    // implement here the method countItems

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Moi");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items on the list:");
        // You can remove the comment from below when the method is done
        System.out.println(countItems(list)); 
    }

}
