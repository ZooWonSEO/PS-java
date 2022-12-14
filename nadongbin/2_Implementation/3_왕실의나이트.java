/*
[문제설명]
왕실 정원은 체스판과 같은 8x8 좌표 평면이다.
나이트는 말을 타고 있기 때문에 이동할 때는 L자 형태로만 이동할 수 있고 정원 밖으로는 나가지 못한다.
나이트는 특정한 위치에서 다음과 같은 2가지 경우로 이동할 수 있다.

1) 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
2) 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기

나이트의 위치가 주어졌을 때 나이트가 이동할 수 있는 경우의 수를 출력하세요.

예를 들어, 나이트가 a1에 있으면
1) 오른쪽으로 두 칸 이동 후 아래로 한 칸 이동하기 (c2)
2) 아래로 두 칸 이동 후 오른쪽으로 한 칸 이동하기 (b3)

---------------
  a  b  c  d
1
2
3
4
---------------

[입력값]
a1

[출력값]
2

*/

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int row = s.charAt(0) - 'a';
        int col = s.charAt(1) - '1';

        int r[] = {-1, -2, -1, -2, 1, 2, 1, 2};
        int c[] = {-2, -1, 2, 1, -2, -1, 2, 1};

        int answer = 0;

        for(int i=0; i<8; i++) {
            int nr = row + r[i];
            int nc = col + c[i];

            if(nr<0 || nc<0 || nr>7 || nc>7)
                continue;

            answer++;
        }

        System.out.println(answer);
    }
}
