/*
[문제설명]
첫째줄에 원소의 개수 n과 찾으려는 수 k가 주어진다.
둘째줄에 원소들이 주어진다.

찾고자하는 수 k의 인덱스를 출력하세요.(1번부터 시작)

[입력값1]
10 7
1 3 5 7 9 11 13 15 17 19

[출력값1]
4

[입력값2]
10 7
1 3 5 6 9 11 13 15 17 19

[출력값2]
-1

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int l = 0;
        int r = arr.length-1;
        int ans = -1;

        while(l<=r) {

            int mid = (int)(l+r)/2;

            if(k == arr[mid]) {
                ans = mid+1;
                break;
            }

            if(k < arr[mid]) {
                r = mid-1;
            }
            else if(k > arr[mid]) {
                l = mid+1;
            }
        }
        System.out.print(ans);
    }
}

