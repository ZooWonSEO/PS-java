package DataStructure;
import java.util.*;

/*
 - 중복을 허용하지 않는다.
 - HashSet, TreeSet
 - HashSet : 순서를 보장하지 않는다. O(1)
 - TreeSet : 순서를 보장한다. O(logn)
 */

public class SetTest {

    public static void main(String[] args){

        // Set 선언
        HashSet<Integer> hs = new HashSet<>();

        // 데이터 삽입
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        // 데이터 삭제
        hs.remove(1);

        // 데이터 존재확인
        System.out.println(hs.contains(3)); // true

        // size()
        System.out.println(hs.size()); // 3

        // isEmpty()
        System.out.println(hs.isEmpty()); // false

        // 데이터 순회
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Set 초기화
        hs.clear();

    }
}
