/*
[문제설명]
Queue 자료구조를 이용해 다음 명령들을 수행하세요.

1) 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
2) 맨앞 원소부터 출력

[출력]
3 7 1 4

*/

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Deque<Integer> dq = new ArrayDeque<>();

        dq.add(5);
        dq.add(2);
        dq.add(3);
        dq.add(7);
        dq.remove();
        dq.add(1);
        dq.add(4);
        dq.remove();

        while(dq.isEmpty() == false){
            System.out.print(dq.peek() + " ");
            dq.remove();
        }
    }
}
