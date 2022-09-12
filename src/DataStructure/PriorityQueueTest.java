package DataStructure;
import java.util.*;

/*
- Queue 이지만 우선순위에 맞게 정렬을 하면 삽입, 삭제를 하는 자료구조
- Heap 구조로 되어 있다.
- add, remove, peek

 */

public class PriorityQueueTest {
    public static void main(String[] args){

        // Priority Queue 선언
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 최소힙
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder()); // 최대힙

        // 데이터 삽입
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        // 데이터 삭제
        pq.remove();

        // root 조회
        System.out.println(pq.peek()); // 2

        // size()
        System.out.println(pq.size()); // 3

        // isEmpty()
        System.out.println(pq.isEmpty()); // false

        // 데이터 순회
        Iterator<Integer> it = pq.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Priority Queue 초기화
        pq.clear();

        // Pair
        PriorityQueue<Pair> pq3 = new PriorityQueue<>(Pair::compareTo);

        pq3.add(new Pair(1, 1));
        pq3.add(new Pair(1, 2));
        pq3.add(new Pair(2, 1));
        pq3.add(new Pair(2, 2));

        Iterator<Pair> it3 = pq3.iterator();
        while(it3.hasNext()){
            Pair p = it3.next();
            System.out.println(p.x + " " + p.y);
        }

    }

    // Pair 구현
    static class Pair {
        int x;
        int y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }

        // 비교함수
        public int compareTo(Pair p){

            if(this.x > p.x) {
                return 1;
            }
            else if(this.x == p.x){
                if(this.y < p.y){
                    return 1;
                }
            }
            return -1;
        }

    }

}
