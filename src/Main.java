import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char arr[] = s.toCharArray();

        int row = 1;
        int col = 1;

        for(int i=0; i<arr.length; i++) {

            int r = 0;
            int c = 0;

            if(arr[i] == 'L') {
                c = -1;
            }

            else if(arr[i] == 'R') {
                c = 1;
            }

            else if(arr[i] == 'U') {
                r = -1;
            }

            else if(arr[i] == 'D') {
                r = 1;
            }

            if(row+r > n || col+c > n || row+r < 1 || col+c < 1)
                continue;

            row = row + r;
            col = col + c;
        }

        System.out.print(row + " " + col);

    }
}
