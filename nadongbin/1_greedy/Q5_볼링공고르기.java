/*
[문제설명]
A, B 두 사람은 서로 무게가 다른 볼링공을 고르려고 합니다.
볼링공은 총 N개가 있으며 각 볼링공마다 무게가 적혀 있고, 공의 번호는 1번부터 순서대로 부여됩니다.
같은 무게의 공이 여러 개 있을 수 있지만, 서로 다른 공으로 간주합니다.
볼링공의 무게는 1부터 M까지의 자연수 형태로 존재합니다.

예를 들어 N이 5이고, M이 3이며 각각의 무게가 차례대로 1, 3, 2, 3, 2일 때
두 사람이 공을 고르는 경우의 수는 8가지 입니다.

N개의 공의 무게가 각각 주어질 때, 두사람이 볼링공을 고르는 경우의 수를 구하세요.

[입력1]
5 3
1 3 2 3 2

[출력1]
8

[입력2]
8 5
1 5 4 3 2 4 5 2

[출력2]
25

 */

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
