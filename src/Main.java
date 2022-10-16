import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int balls[] = new int[m+1];

        for(int i=0; i<n; i++) {
            int input = sc.nextInt();
            balls[input] ++;
        }

        int answer = 0;
        for(int i=1; i<m; i++) {
            n = n - balls[i];
            answer = answer + (n * balls[i]);
        }

        System.out.print(answer);

    }
}
