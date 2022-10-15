/*
[문제설명]
각 자리의 숫자(0부터 9)로만 이루어진 문자열 S가 있다.
왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하여 숫자 사이에 x 혹은 +를 넣어 가장 큰 수를 구하세요.

단, 모든 연산은 일반 방법과 달리 왼쪽에서부터 순서대로 이루어진다.

[입력1]
02984

[출력1]
576

[입력2]
567

[출력2]
210

 */


import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        int answer = 0;

        for(int i=0; i<arr.length; i++) {

            if(answer == 0 || arr[i] == '0') {
                answer = answer + (arr[i] - '0');
            }

            else {
                answer = answer * (arr[i] - '0');
            }
        }
        System.out.print(answer);

    }
}
