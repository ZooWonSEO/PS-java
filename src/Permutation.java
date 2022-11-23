import java.util.*;

/*
순열 : n개의 수에서 r개를 뽑는다.
 */

public class Permutation {

    public static void dfs(int[] visited, int[] arr, int n, int r, int cnt) {

        if(cnt == r) {

            for(int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            return;
        }

        for(int i=0; i<n; i++) {

            if(visited[i] == 1)
                continue;
            visited[i] = 1;
            arr[cnt] = i;
            dfs(visited, arr, n, r, cnt+1);
            visited[i] = 0;
        }

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int r = 3;
        int[] visited = new int [n];
        int[] arr = new int[r];

        dfs(visited, arr, n, r, 0);

    }
}

