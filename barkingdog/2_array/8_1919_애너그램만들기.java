import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();

        for(int i=0; i<a.length; i++){
            int tmp = (int)a[i] - 97;
            arr[tmp] ++;
        }

        for(int i=0; i<b.length; i++){
            int tmp = (int)b[i] - 97;
            arr[tmp] --;
        }

        int answer = 0;
        for(int i=0; i<26; i++){
            if(arr[i] != 0){
                answer = answer + Math.abs(arr[i]);
            }
        }

        System.out.println(answer);
    }
}
