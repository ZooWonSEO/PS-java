import java.util.*;

public class Main {

    public static int n, m, answer;
    public static int[][] map, visited;
    public static int[] x = {0, 0, -1, 1};
    public static int[] y = {1, -1, 0, 0};

    public static void dfs(int s1, int s2) {

        visited[s1][s2] = 1;

        for(int i=0; i<4; i++) {
            int nx = x[i] + s1;
            int ny = y[i] + s2;

            if(nx<0 || ny<0 || nx>=n || ny>=m)
                continue;

            if(visited[nx][ny] == 1 || map[nx][ny] == 1)
                continue;

            dfs(nx, ny);
        }

        return;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        map = new int[n][m];
        visited = new int[n][m];

        for(int i=0; i<n; i++) {
            String s = sc.nextLine();
            char[] s_arr = s.toCharArray();

            for(int j=0; j<s_arr.length; j++) {
                map[i][j] = s_arr[j] - '0';
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {

                if(visited[i][j] == 1 || map[i][j] == 1)
                    continue;

                dfs(i, j);
                answer++;
            }
        }

        System.out.print(answer);
    }
}
