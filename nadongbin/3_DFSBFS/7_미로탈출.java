/*
[문제설명]
동빈이는 NXM 크기의 직사각형 미로에 갇혀있다.
동빈이의 위치는 (1,1)이고, 출구는 (N,M)이며 한번에 한칸씩 이동할 수 있다.
이때 괴물이 있는 부분은 0, 없는 부분은 1이다.
이때 동빈이가 탈출하기 위해 움직여야 하는 최소 칸의 개수를 구하세요.
시작 칸과 마지막 칸을 모두 포함해서 계산합니다.

4 <= N,M <= 200

[입력]
5 6
101010
111111
000001
111111
111111

[출력]
10

*/

import java.util.*;

class node {
    private int x;
    private int y;

    public node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }
}

public class Main {

    public static int n, m;
    public static int[][] map;
    public static int dx[] = {0, 0, -1, 1};
    public static int dy[] = {-1, 1, 0, 0};

    public static void bfs() {

        Queue<node> q = new LinkedList<>();
        q.add(new node(0, 0));

        while(!q.isEmpty()) {

            node nd = q.peek();
            q.remove();

            int x = nd.getx();
            int y = nd.gety();

            for(int i=0; i<4; i++) {

                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx<0 || ny<0 || nx>=n || ny>=m)
                    continue;

                if(map[nx][ny] == 0)
                    continue;

                if(map[nx][ny] == 1) {
                    map[nx][ny] = map[x][y] + 1;
                    q.add(new node(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        map = new int[n][m];

        for(int i=0; i<n; i++) {
            String s = sc.nextLine();
            for(int j=0; j<s.length(); j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        bfs();
        System.out.print(map[n-1][m-1]);
    }
}