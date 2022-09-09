import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        String arr[] = list.toArray(new String[list.size()]);
        System.out.println(arr);

    }
}
