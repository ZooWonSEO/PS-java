import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        Arrays.sort(arr);

        if(arr[0]!=arr[1] && arr[1]!=arr[2] && arr[0]!=arr[1]) {
            System.out.println(arr[2]*100);
        }
        else if(arr[0] == arr[1] && arr[1] == arr[2] && arr[0] == arr[2]) {
            System.out.println(10000 + arr[2]*1000);
        }
        else if((arr[0]==arr[1] && arr[0]!=arr[2])){
            System.out.println(1000 + arr[0]*100);
        }
        else if((arr[0]==arr[2] && arr[0]!=arr[1])){
            System.out.println(1000 + arr[0]*100);
        }
        else if((arr[1]==arr[2] && arr[1]!=arr[0])){
            System.out.println(1000 + arr[1]*100);
        }

    }
}
