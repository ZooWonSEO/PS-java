/*
[문제설명]
수열을 내림차순으로 정렬하는 프로그램을 만드세요.

첫째 줄에 수열에 속해 잇는 수의 개수 N이 주어진다. (1 <= N <= 500)
둘째 줄부터 N+1번째 줄까지 N개의 수가 입려된다. 수의 범위는 1이상 100,000이하의 자연수이다.

[입력값]
3
15
27
12

[출력값]
27 15 12

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

