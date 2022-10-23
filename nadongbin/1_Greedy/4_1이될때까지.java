/*
[문제설명]
어떠한 수 N이 있을 떄, 1일 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하려고 한다.
단, 2번연산은 N이 K로 나누어 떨어질 떄만 가능하다.

1. N에서 1을 뺀다.
2. N을 K로 나눈다.

가장 최소한의 연산 횟수를 구하세요.

[입력]
25 5

[출력]
2

 */

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int answer = 0;

        while(n>1){

            if(n%k == 0){
                n = n/k;
            }
            else{
                n = n - 1;
            }
            answer ++;
        }
        System.out.println(answer);
    }
}
