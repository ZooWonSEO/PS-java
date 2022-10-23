/*
[문제설명]
거스름돈으로 줄 수 있는 동전은 [500원, 100원, 50원, 10원]이다.
손님에게 거슬러 줘야할 돈이 N원일 때, 거슬러줘야 할 동전의 최소 개수를 구하세요.

[입력값]
N : 1260

[출력값]
6
 */

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = {500, 100, 50, 10};

        int answer = 0;

        for(int i=0; i<coins.length; i++){
            int coin = coins[i];
            answer = answer + (n/coin);
            n = n%coin;
        }

        System.out.print(answer);

    }
}