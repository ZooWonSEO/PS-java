/*
[문제설명]
절단기에 높이 H를 지정하면 줄지어진 떡을 한 번에 절단한다.
높이가 H보다 긴 떡은 H 위의 부분이 잘릴 것이고, 낮은 떡은 잘리지 않는다.

예를 들어 높이가 19 14 10 17인 떡이 나란히 있고 절단기 높이를 15로 지정하면
자른 뒤 떡의 높이는 15 14 10 15가 될 것이다.
잘린 떡의 길이는 차례대로 4 0 0 2이다.
손님은 6만큼의 길이를 가져간다.

손님이 왔을 때 요청한 총 길이가 M일 때 적어도 M만큼의 떡을 얻기 위해
절단기에 설정할 수 있는 높이의 최댓값을 구하는 프로그램을 작성하세요.

첫째줄에 떡의 개수 N과 요청한 떡의 길이 M이 주어진다.
둘째줄에 떡의 개별 높이가 주어진다. 떡 높이의 총합은 항상 M이상이다.
손님은 필요한 양만큼 떡을 사갈 수 있다.

[입력값]
4 6
19 15 10 17

[출력값]
15

*/

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int ans = 0;
        int l = 0;
        int r = arr[n-1];

        while(l<=r) {

            int mid = (int)(l+r) / 2;
            int sum = 0;

            for(int i=0; i<n; i++) {
                if(arr[i] < mid)
                    continue;
                sum = sum + (arr[i]-mid);
            }

            if(sum < m) {
                r = mid-1;
            }
            else if(sum >= m) {
                l = mid+1;
                ans = mid;
            }
        }

        System.out.println(ans);
    }
}
