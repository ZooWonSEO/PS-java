package DataStructure;
import java.util.*;

/*
- Queue이지만 앞 뒤로 데이터 삽입, 삭제가 가능하다.
- Java에서 Deque는 ArrayDeque로 선언한다.
- add(offer), addFirst, addLast
- remove(poll), removeFirst, removeLast
- peek, peekFirst, peekLast

 */

public class DequeTest {
    public static void main(String[] args){

        // Deque 선언
        Deque<Integer> dq = new ArrayDeque<>();

        // 데이터 삽입
        dq.addFirst(1);
        dq.add(2);
        dq.addLast(3);
        dq.add(4);

        // 데이터 삭제
        dq.removeFirst();
        dq.removeLast();

        // 데이터 조회
        System.out.println(dq.peekFirst()); // 2
        System.out.println(dq.peekLast()); // 3

        // size()
        System.out.println(dq.size()); // 2

        // isEmpty()
        System.out.println(dq.isEmpty()); // false;

        // 데이터 순회
        Iterator<Integer> it = dq.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Deque 초기화
        dq.clear();

    }
}
