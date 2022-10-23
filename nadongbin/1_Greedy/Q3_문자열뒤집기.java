/*
[문제설명]
0과 1로만 이루어진 문자열 s가 있습니다.
문자열 s에 있는 모든 숫자를 전부 같게 만드려고 합니다.
다솜이가 할 수 잇는 행동은 s에서 연속된 하나 이상의 숫자를 잡고 모두 뒤집는 것입니다.
뒤집는 것은 1->0, 0->1로 바꾸는 것을 의미합니다.

문자열 s가 주어졌을 때, 최소한의 행동 횟수를 구하세요.

[입력]
0001100

[출력]
1

 */


import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        int cnt1 = 0;
        int cnt2 = 0;

        for(int i=0; i<arr.length-1; i++) {

            // 0->1
            if (arr[i] == '0' && arr[i + 1] == '1') {
                cnt1++;
            }

            // 1->0
            if (arr[i] == '1' && arr[i + 1] == '0') {
                cnt2++;
            }
        }

        System.out.println(Math.min(cnt1, cnt2));
    }
}

