/*
[문제설명]
NXM 크기의 얼음틀이 있다. 구멍이 뚫려 있는 부분은 0, 칸막이는 1이다.
구멍이 뚫려 있는 부분끼리 상, 하, 좌, 우로 붙어 있는 경우 서로 연결되어 있는 것이다.
이때, 얼음 틀의 모양이 주어졌을 때 생성되는 총 아이스크림의 개수를 구하세요.

1 <= N,M <= 1000

[입력1]
4 5
00110
00011
11111
00000

[출력1]
3

[입력2]
15 14
00000111100000
11111101111110
11011101101110
11011101100000
11011111111111
11011111111100
11000000011111
01111111111111
00000000011111
01111111111000
00011111111000
00000001111000
11111111110011
11100011111111
11100011111111

[출력2]
8

*/


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
            for(int j=0; j<s.length(); j++) {
                map[i][j] = s.charAt(j) - '0';
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
