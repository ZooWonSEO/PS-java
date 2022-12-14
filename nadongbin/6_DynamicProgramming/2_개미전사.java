/*
[문제설명]
각 식량창고에는 정해진 수의 식량을 저장하고 있다.
개미 전사는 식량창고를 선택적으로 약탈해 식량을 빼앗을 예정이다.
이때 메뚜기 정찰병들은 일직선상에 존재하는 식량창고 중에서 서로 인접한 식량창고가 공격받으면 안다.
개미전사가 정찰병에게 들키지 않고 식량창고를 약탈하기 위해서는 최소 한칸이상 떨어진 창고를 약탈해야한다.

식량창고 N에 대한 정보가 주어졌을 때 얻을 수 있는 식량의 최댓값을 구하세요.

첫쩨줄에 식량창고의 개수 N이 주어진다.
둘째줄에 공백으로 구분되어 각 식량창고에 저장된 식량의 개수 K가 주어진다.

3 <= N <= 100
0 <= K <= 1000

[입력값]
4
1 3 1 5

[출력값]
8

*/

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
