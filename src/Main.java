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
