import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int[] answer = new int[10];

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        long mul = (long)a * (long)b * (long)c;
        String s = String.valueOf(mul);

        for(int i=0; i<s.length(); i++){
            int tmp = (int)s.charAt(i) - 48;
            answer[tmp] ++;
        }

        for(int i=0; i<10; i++) {
            System.out.println(answer[i]);
        }
    }
}
