import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];

        for(int i=3; i<n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]+arr[i]);
        }

        int answer = dp[n-1];
        System.out.print(answer);
    }
}
