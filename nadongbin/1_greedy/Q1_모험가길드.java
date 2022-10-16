/*
[문제설명]
모험가가 N명이 있습니다. 공포도가 x인 모험가는 반드시 x명이상으로 구성한 모험가 그룹에 참여해야한다.
동빈이를 위해 N명의 모험가에 대한 정보가 주어졌을 때, 여향을 떠날 수 있는 그룹의 최댓값을 구하세요.

단, 모든 모험가를 특정한 그룹에 넣을 필요는 없습니다.

N
각 모험가의 공포도

[입력]
5
2 3 1 2 2

[출력]
2

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

        int answer = 0;
        int cnt = 0 ;

        for(int i=0; i<arr.length; i++) {

            cnt ++;
            if(cnt >= arr[i]) {
                answer++;
                cnt = 0;
            }
        }

        System.out.print(answer);
    }
}
