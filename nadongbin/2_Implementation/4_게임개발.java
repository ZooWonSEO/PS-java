/*
[문제설명]
캐릭터가 있는 장소는 NxM 크기의 직사각형으로, 각가의 칸은 육지 또는 바다이다.
맵의 각 칸은 (A, B)로 나타낼 수 있다.
A는 북쪽으로 부터, B는 서쪽으로 부터 떨어진 칸의 개수이다.
캐릭터는 상하좌우로 움직일 수 있고, 바다로 되어 있는 공간에는 갈 수 없다.

1. 현재 위치에서 현재 방향을 기준으로 왼쪽 방향(반시계 방향으로 90도 회전한 방향)부터
차례대로 갈 곳을 정한다.

2. 캐릭터의 바로 왼쪽 방향에 아직 가보지 않은 칸이 존재한다면, 왼쪽 방향으로 회전한 다음
왼쪽으로 한 칸을 전진한다. 왼쪽 방향에 가보지 않은 칸이 없다면, 왼쪽 방향으로 회전만
수행하고 1단계로 돌아간다.

3. 만약 네 방향 모두 이미 가본 칸이거나 바다로 되어 있는 칸인 경우에는, 바라보는 방향을
유지한 채로 한 칸 뒤로 가고 1단계로 돌아간다. 단, 이때 뒤쪽 방향이 바다인 칸이라 뒤로
갈 수 없는 경우에는 움직임을 멈춘다.

다음의 메뉴얼을 진행하며, 캐릭터가 방문한 칸의 개수를 출력하세요.

0-북쪽, 1-동쪽, 2-남쪽, 3-서쪽
0-육지, 1-바다

세로크기 N, 가로크기 M, 캐릭터가 바라보는 방향 d
(3 <= N, M <= 50)

[입력값]
4 4
1 1 0
1 1 1 1
1 0 0 1
1 1 0 1
1 1 1 1

[출력값]
3

*/


import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static int n, m, x, y, d;
    public static int[][] map = new int[50][50];
    public static int[][] visited = new int[50][50];

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void turnLeft() {
        d = d-1;
        if(d == -1) {
            d = 3;
        }
        return;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        y = sc.nextInt();
        d = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        visited[x][y] = 1;

        int answer = 1;
        int turn_time = 0;

        while(true) {

            turnLeft();

            int nx = x + dx[d];
            int ny = y + dy[d];

            if(map[nx][ny] == 0 && visited[nx][ny] == 0) {
                x = nx;
                y = ny;
                visited[x][y] = 1;
                answer++;
                turn_time = 0;
                continue;
            }

            else{
                turn_time++;
            }

            if(turn_time == 4) {
                nx = x - dx[d];
                ny = y - dy[d];

                if(map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                    turn_time = 0;
                    continue;
                }

                else
                    break;
            }
        }
        System.out.print(answer);
    }
}
