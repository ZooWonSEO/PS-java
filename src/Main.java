import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        String str = "Hello World!!";
        System.out.println(str);

        char[] arr = str.toCharArray();
        System.out.println(arr);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        System.out.println(sb);
        System.out.println(sb.toString());


    }
}
