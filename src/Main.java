import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int answer = -1;
        int[] dp = new int[m+1];
        for(int i=0; i<=m; i++) {
            dp[i] = 10001;
        }
        dp[0] = 0;

        for(int i=0; i<n; i++) {
            for(int j=arr[i]; j<=m; j++) {
                dp[j] = Math.min(dp[j], dp[j-arr[i]] + 1);
            }
        }

        answer = dp[m];
        if(answer == 10001) {
            answer = -1;
        }

        System.out.println(answer);
    }
}
