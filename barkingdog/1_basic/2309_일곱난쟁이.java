import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[9];
        int sum = 0;
        int ans1 = 0;
        int ans2 = 0;
        int flag = 0;

        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        Arrays.sort(arr);

        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if((sum - arr[i] - arr[j]) == 100) {
                    ans1 = i;
                    ans2 = j;
                    flag = 1;
                    break;
                }
            }

            if(flag == 1)
                break;

        }

        for(int i=0; i<9; i++){
            if(i == ans1 || i == ans2)
                continue;

            System.out.println(arr[i]);
        }

    }
}
