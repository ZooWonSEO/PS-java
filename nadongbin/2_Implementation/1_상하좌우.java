/*
[문제설명]
여행가 A는 크기가 NxN인 정사각형 공간에 있다.
가장 왼쪽 위 좌표는 (1,1)이며, 가장 오른쪽 아래 좌표는 (N,N)이다.
시작 좌표는 항상 (1,1)이며 상,하,좌,우로 움직일 수 있다.
L : 왼쪽으로 한 칸
R : 오른쪽으로 한 칸
U : 위쪽으로 한 칸
D : 아래쪽으로 한 칸

이때, 여행가 A가 NxN 정사각형을 벗어나는 움직임은 무시된다.
계획서가 주어졌을 때, 여행가 A가 최종적으로 도착할 지점의 좌표를 출력하세요.

[입력값]
5
R R R U D D

[출력값]
3 4

*/

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
