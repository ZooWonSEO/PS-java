/*
[문제설명]
큰 수의 법칙은 다양한 수로 이루어진 배열이 있을 떄, 주어진 수들을 M번 더해 가장 큰 수를 만드는 법칙이다.
단, 배열의 특정한 인덱스에 해당하는 수가 연속해서 K번 초과해 더해질 수 없다.

첫쨰줄 : 배열의 크기 N, 숫자가 더해지는 횟수 M, K
둘쨰줄 : 배열

[입력]
5 8 3
2 4 5 4 6

[출력]
46

 */

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int n;
    static int m;
    static int k;
    static int[] arr;

    public static void func1() {
        int answer = 0;
        int first = arr[n-1];
        int second = arr[n-2];

        int cnt = 0;
        for(int i=0; i<m; i++){
            if (cnt == k) {
                cnt = 0;
                answer = answer + second;
            }
            else{
                answer = answer + first;
                cnt++;
            }
        }

        System.out.println(answer);
    }

    public static void func2() {
        int answer = 0;
        int first = arr[n-1];
        int second = arr[n-2];

        int sec_cnt = (int)(m / k);
        int fir_cnt = m - sec_cnt;

        answer = (first*fir_cnt) + (second*sec_cnt);

        System.out.println(answer);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        func1();
        func2();
    }
}

