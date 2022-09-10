import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[26];
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            arr[(int)str.charAt(i) - 97] ++;
        }

        for(int i=0; i<26; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
