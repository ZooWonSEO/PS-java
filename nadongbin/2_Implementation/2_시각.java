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

        int h = 0;
        int m = 0;
        int s = 0;
        int answer = 0;

        while(true) {

            if(h == n+1 && m == 0 && s == 0)
                break;

            s++;

            if(s == 60) {
                s = 0;
                m = m + 1;
            }

            if(m == 60) {
                m = 0;
                h = h + 1;
            }

            if(String.valueOf(h).length() == 2) {
                if(String.valueOf(h).charAt(0) == '3' || String.valueOf(h).charAt(1) == '3') {
                    answer = answer + 1;
                    continue;
                }
            }
            else {
                if(String.valueOf(h).charAt(0) == '3') {
                    answer = answer + 1;
                    continue;
                }
            }

            if(String.valueOf(m).length() == 2) {
                if(String.valueOf(m).charAt(0) == '3' || String.valueOf(m).charAt(1) == '3') {
                    answer = answer + 1;
                    continue;
                }
            }
            else {
                if(String.valueOf(m).charAt(0) == '3') {
                    answer = answer + 1;
                    continue;
                }
            }

            if(String.valueOf(s).length() == 2) {
                if(String.valueOf(s).charAt(0) == '3' || String.valueOf(s).charAt(1) == '3') {
                    answer = answer + 1;
                }
            }
            else {
                if (String.valueOf(s).charAt(0) == '3') {
                    answer = answer + 1;
                }
            }
        }

        System.out.print(answer);
    }
}
