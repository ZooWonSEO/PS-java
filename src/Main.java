import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];

        int px = sc.nextInt();
        int py = sc.nextInt();
        int d = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int[] x = {-1, 0, 1, 0};
        int[] y = {0, 1, 0, -1};

        int answer = 0;



        System.out.println(answer);
    }
}
