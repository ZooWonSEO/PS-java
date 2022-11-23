/*
[문제설명]
정수 X가 주어질 때 정수 X에 사용할 수 있는 연산은 다음과 같이 4가지이다.

1. X가 5로 나누어떨어지면, 5로 나눈다.
2. X가 3으로 나누어떨어지면, 3으로 나눈다.
3. X가 2로 나누어떨어지면, 2로 나눈다.
4. X에서 1을 뺀다.

정수 X가 주어졌을 때, 연산 4개를 활용해 1을 만드려고 한다.
연산을 사용하는 횟수의 최솟값을 구하세요.

1 <= X <= 30000

ex) 26-1 -> 25/5 -> 5/5


[입력값]
26

[출력값]
3

*/

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] dp = new int[30002];

        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for(int i=4; i<=x; i++) {
            dp[i] = dp[i-1] + 1;

            if(i%2 == 0) {
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }

            if(i%3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }

            if(i%5 == 0) {
                dp[i] = Math.min(dp[i], dp[i/5] + 1);
            }
        }

        int ans = dp[x];
        System.out.print(ans);
    }
}
