/*
[문제설명]

숫자카드게임은 여러 개의 숫자 카드 중에서 가장 높은 숫자가 쓰인 카드 한 장을 뽑는 게임이다.
단, 게임의 룰을 지키며 카드를 뽑아야 한다.

1. 숫자가 쓰인 카드들이 N X M 형태로 놓여있다. 이떄 N은 행의 개수, M은 열의 개수이다.
2. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
3. 그다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야 한다.
4. 따라서 처음에 카드를 골라낼 행을 선택할 떄, 이후에 해당 행에서 가장 숫자가 낮은 카드를 뽑을 것을 고려한다.
최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야한다.

[조건]
행의 개수 N과 열의 개수 M
N개의 줄에 결처 각 타드에 적힌 숫자가 주어진다.
각 숫자는 1이상 10000이하의 자연수이다.

게임의 룰에 맞게 선택한 카드에 적힌 숫자를 출력한다.

[입력]
(1)
3 3
3 1 2
4 1 4
2 2 2

(2)
2 4
7 3 1 8
3 3 3 4

[출력]
(1) 2
(2) 3

 */

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = 0;
        for(int i=0; i<n; i++) {

            int min_val = 99999;

            for(int j=0; j<m; j++){
                int input = sc.nextInt();
                min_val = Math.min(min_val, input);
            }

            answer = Math.max(answer, min_val);
        }
        System.out.println(answer);
    }
}
