import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int h = 0;
        int m = 0;
        int s = 0;
        int answer = 0;

        while(true) {

            if(h == n+1 && m == 0 && s == 0)
                break;

            s++;

            if(s == 60) {
                s = 0;
                m = m + 1;
            }

            if(m == 60) {
                m = 0;
                h = h + 1;
            }

            if(String.valueOf(h).length() == 2) {
                if(String.valueOf(h).charAt(0) == '3' || String.valueOf(h).charAt(1) == '3') {
                    answer = answer + 1;
                    continue;
                }
            }
            else {
                if(String.valueOf(h).charAt(0) == '3') {
                    answer = answer + 1;
                    continue;
                }
            }

            if(String.valueOf(m).length() == 2) {
                if(String.valueOf(m).charAt(0) == '3' || String.valueOf(m).charAt(1) == '3') {
                    answer = answer + 1;
                    continue;
                }
            }
            else {
                if(String.valueOf(m).charAt(0) == '3') {
                    answer = answer + 1;
                    continue;
                }
            }

            if(String.valueOf(s).length() == 2) {
                if(String.valueOf(s).charAt(0) == '3' || String.valueOf(s).charAt(1) == '3') {
                    answer = answer + 1;
                }
            }
            else {
                if (String.valueOf(s).charAt(0) == '3') {
                    answer = answer + 1;
                }
            }
        }

        System.out.print(answer);
    }
}
