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