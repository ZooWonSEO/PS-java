/*
[문제설명]
두개의 배열 A,B는 N개의 원소로 구성되어 있으며 배열의 원소는 모두 자연수이다.
동빈이는 최대 K번의 바꿔치기 연산을 수행할 수 있다.
바꿔치기 연산은 배열 A에 있는 원소 하나와 배열 B에 있는 원소 하나를 골라서 두 원소를 서로 바꾸는 것이다.
최종목표는 배열 A의 모든 원소의 합이 최대가 되도록 하는 것이다.

첫번째 줄에 N, k가 공백으로 구분되어 입력된다. (1<=N<=10000, 0<=K<=N)
두번째 줄에 배열 A의 원소들이 공백으로 구분되어 입력된다.
세번째 줄에 배열 B의 원소들이 공백으로 구분되어 입력된다.

[입력값]
5 3
1 2 5 4 3
5 5 6 6 5

[출력값]
26

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for(int i=0; i<n; i++) {
            arrA[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for(int i=0; i<k; i++) {

            if(arrA[i] < arrB[n-1-i]) {
                int tmp = arrA[i];
                arrA[i] = arrB[n-i-1];
                arrB[i] = tmp;
            }

            else
                break;
        }

        int answer = 0;
        for(int i=0; i<n; i++) {
            answer = answer + arrA[i];
        }

        System.out.print(answer);
    }
}

