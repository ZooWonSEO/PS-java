package DataStructure;
import java.util.*;

/*
- First In First Out (FIFO) 구조
- Java에서 Queue는 LinkedList로 선언한다.
- add(offer), remove(poll), peek

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

        // size()
        System.out.println(q.size()); // 3

        // isEmpty()
        System.out.println(q.isEmpty()); // false

        // 데이터 순회
        Iterator<Integer> it = q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Queue 초기화
        q.clear();

        // Pair
        Queue<Pair> q2 = new LinkedList<>();
        q2.add(new Pair(1,2));
        q2.add(new Pair(2,3));

        Pair tmp = q2.peek();
        System.out.println(tmp.x + " "  + tmp.y); // 1 2

    }

    // Pair 구현
    static class Pair {
        int x;
        int y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
