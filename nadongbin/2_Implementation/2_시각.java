/*
[문제설명]
정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중,
3이 하나라도 포함되는 모든 경우의 수를 구하세요.

예를 들어 1을 입력했을 때, 다음은 3이 하나라도 포함되어 세어야하는 시각입니다.
00시 00분 03초, 00시 13분 30초

[입력값]
5

[출력값]
11475

*/

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 0;

        int h = 0;
        int m = 0;
        int s = 0;

        while(true) {

            if(h == n+1 && m == 0 && s == 0)
                break;

            s++;

            if(s == 60) {
                s = 0;
                m = m+1;
            }

            if(m == 60) {
                m = 0;
                h = h+1;
            }

            if(h%10 == 3 || h/10 == 3 || m%10 == 3 || m/10 == 3 || s%10 == 3 || s/10 == 3) {
                answer ++;
            }
        }

        System.out.print(answer);
    }
}

