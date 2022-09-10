import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[12];

        for(int i=0; i<n; i++){

            int s = sc.nextInt();
            int y = sc.nextInt();

            if(s == 0){
                arr[y-1]++;
            }
            else {
                arr[y-1+6]++;
            }
        }

        int answer = 0;
        for(int i=0; i<12; i++){
            if(arr[i]%k == 0){
                answer = answer + (arr[i]/k);
            }
            else{
                answer = answer + (arr[i]/k) + 1;
            }
        }

        System.out.println(answer);
    }
}
