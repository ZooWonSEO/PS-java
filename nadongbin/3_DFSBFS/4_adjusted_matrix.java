/*
[문제설명]
3x3의 인접행렬 그래프를 출력하세요.

[입력]
{0, 7, 5},
{7, 0, INF},
{5, INF, 0}

*/

public class Main {

    public static final int INF = 9999999;
    public static int[][] graph = {
            {0, 7, 5},
            {7, 0, INF},
            {5, INF, 0}
    };

    public static void main(String args[]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}