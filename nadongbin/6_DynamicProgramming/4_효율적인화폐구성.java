/*
[문제설명]
N가지 종류의 화폐가 있다.
화폐들의 개수를 최소한으로 이용해서 그 가치의 합이 M원이 되도록 하려고 한다.
이때 각 화폐는 몇 개라도 사용할 수 있다.
사용한 화폐의 구성은 같지만 순서만 다른것은 같은 경우로 본다.

예를 들어 2원, 3원 단위의 화폐가 있을 떄는 15원을 만들기 위해 3원을 5개 사용하는 것이 가장 최소한이다.

첫째 줄에 N,M이 주어진다. (1<=N<=100, 1<=M<=10000)
이후 N개의 줄에는 각 화폐의 가치가 주어진다.

불가능할 떄는 -1을 출력한다.

[입력값1]
2 15
2
3

[출력값1]
5

[입력값2]
3 4
3
5
7

[출력값2]
-1

*/

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
