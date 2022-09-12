package DataStructure;
import java.util.*;

/*
- First In First Out (FIFO) 구조
- add, remove, peek
- Java에서 Queue는 LinkedList로 선언해야한다.

 */

public class QueueTest {
    public static void main(String[] args) {

        // Queue 선언
        Queue<Integer> q = new LinkedList<>();

        // 데이터 삽입
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        // 데이터 삭제
        q.remove();

        // 맨 앞 데이터 조회
        System.out.println(q.peek()); // 2

        // size();



    }
}
