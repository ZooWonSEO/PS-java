/*
[문제설명]
전자매장에는 부품이 N개 있다. 각 부품은 정수 형태의 고유한 번호가 있다.
손님이 M개 종류의 부품 견적서를 요청했다.
가게 안에 부품이 모두 있는지 확인하는 프로그램을 작성하세요.

첫째줄에 정수 N이 주어진다.
둘쨰줄에는 공백으로 구분해 N개의 정수가 주어진다.
셋째줄에는 정수 M이 주어진다.
넷째줄에는 공백으로 구분하여 M개의 정수가 주어진다.

부품이 있으면 yes, 없으면 no를 출력한다.

[입력값]
5
8 3 7 9 2
3
5 7 9

[출력값]
no yes yes

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int m = sc.nextInt();
        int ans = -1;

        for(int i=0; i<m; i++) {

            int item = sc.nextInt();
            int l = 0;
            int r = arr.length-1;

            while(l<=r) {

                int mid = (int)(l+r)/ 2;

                if(item == arr[mid]){
                    ans = 0;
                    break;
                }

                if(item < arr[mid]) {
                    r = mid-1;
                }
                else if(item > arr[mid]) {
                    l = mid+1;
                }
            }

            if(ans == -1 ) {
                System.out.println("no");
            }
            else{
                System.out.println("yes");
            }
            ans = -1;
        }
    }
}

