/*
[문제설명]
N개의 동전을 이용하여 만들 수 없는 양의 정수 금액 중 최솟값을 구하세요.

N이 3이고, 각 동전이 각각 3, 5, 7월일 떄, 최솟값은 1입니다.

[입력]
5
3 2 1 1 9

[출력]
8

 */


import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int answer = 1;
        for(int i=0; i<arr.length; i++) {
            if(answer < arr[i])
                break;

            answer = answer + arr[i];
        }

        System.out.println(answer);
    }
}
