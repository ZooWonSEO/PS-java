import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++){

            char[] a = sc.next().toCharArray();
            char[] b = sc.next().toCharArray();

            int[] arr = new int[26];

            for(int j=0; j<a.length; j++){
                int tmp = (int)a[j] - 97;
                arr[tmp]++;
            }

            for(int j=0; j<b.length; j++){
                int tmp2 = (int)b[j] - 97;
                arr[tmp2]--;
            }

            boolean check = true;
            for(int j=0; j<26; j++){
                if(arr[j]!=0){
                    check = false;
                    break;
                }
            }

            if(check==true){
                System.out.println("Possible");
            }
            else{
                System.out.println("Impossible");
            }
        }


    }
}
