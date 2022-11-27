/*
[문제설명]
가로의 길이가 N, 세로의 길이가 2인 직사각형 형태의 얇은 바닥이 있다.
태일이는 이 얇은 바닥을 1X2, 2X1, 2X2 덮개를 이용해 채우고자 한다.

이때 바닥을 채우는 모든 경우의 수를 구하세요.
방법의 수를 796796으로 나눈 나머지를 출력한다.

1 <= N <= 1000

[입력값]
3

[출력값]
5

*/
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;

        for(int i=4; i<=n; i++) {
            dp[i] = (dp[i-1] + (2*dp[i-2])) % 796796;
        }

        int answer = dp[n];
        System.out.print(answer);
    }
}
