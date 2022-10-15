import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        int answer = 0;

        for(int i=0; i<arr.length; i++) {

            if(answer == 0 || arr[i] == '0') {
                answer = answer + (arr[i] - '0');
            }

            else {
                answer = answer * (arr[i] - '0');
            }
        }
        System.out.print(answer);

    }
}
