import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        char[] arr = s.toCharArray();

        int[] number = new int[10];

        for(int i=0; i<arr.length; i++){
            int tmp = (int)arr[i] - 48;
            number[tmp] ++;
        }

        int tmp = number[6]+number[9];
        if(tmp%2 == 0){
            tmp = tmp/2;
        }
        else {
            tmp = tmp/2 + 1;
        }

        number[6] = tmp;
        number[9] = tmp;

        int answer = 0;
        for(int i=0; i<10; i++) {
            if(number[i] > answer){
                answer = number[i];
            }
        }

        System.out.println(answer);
    }
}
