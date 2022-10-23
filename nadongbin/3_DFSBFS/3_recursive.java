/*
[문제설명]
재귀적으로 n! 을 구하세요.

[입력]
5

[출력]
120

*/

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static int answer = 1;
    public static int factorial(int num) {
        if(num == 0)
            return 1;
        return factorial(num-1) * num;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        answer = factorial(n);

        System.out.print(answer);
    }
}
