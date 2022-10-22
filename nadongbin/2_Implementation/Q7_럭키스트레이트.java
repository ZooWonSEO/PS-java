/*
[문제설명]
현재 캐릭터의 점수를 N이라고 할 때, 자릿수를 기준으로 점수 N을 반으로 나눈다.
이때, 왼쪽 부분의 각 자릿수의 합과 오른쪽 부분의 각 자릿수의 합이 같은 경우를 특정조건이라고 한다.

현재 점수 N이 주어질 떄, 특정조건이면 LUCKY를 아니라면 READY를 출력하세요.

10 <= N <= 99999999
N은 항상 짝으로 주어진다.

[입력값1]
123402

[출력값1]
LUCKY

[입력값2]
7755

[출력값2]
READY

*/

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int left = 0;
        int right = 0;

        for(int i=0; i<str.length(); i++) {

            if(i < str.length()/2) {
                left = left + (str.charAt(i) - '0');
            }
            else{
                right = right + (str.charAt(i) - '0');
            }
        }

        if(left == right) {
            System.out.println("LUCKY");
        }
        else {
            System.out.println("READY");
        }
    }
}

