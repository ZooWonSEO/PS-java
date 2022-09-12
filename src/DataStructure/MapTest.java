package DataStructure;
import java.util.*;

/*
 - <key, value> 한 쌍으로 가지는 자료형
 - 순차적으로가 아닌 key를 통해 value를 구한다.
 - 중복을 허용한다.
 - HashMap, TreeMap
 - HashMap : 순서를 보장하지 않는다. O(1)
 - TreeMap : 순서를 보장한다. O(logn)
 */

public class MapTest {
    public static void main(String[] args){

        // HashMap 선언
        HashMap<Integer, String> hm = new HashMap<>();

        // 데이터 삽입
        hm.put(1, "a");
        hm.put(2, "b");
        hm.put(3, "c");
        hm.put(4, "d");

        // 데이터 삭제
        hm.remove(1);

        // key 존재 확인
        System.out.println(hm.containsKey(3)); // true

        // value 존재 확인
        System.out.println(hm.containsValue("c")); // true

        // size()
        System.out.println(hm.size()); // 3

        // isEmpty()
        System.out.println(hm.isEmpty()); // false

        // Key값 배열로 반환
        System.out.println(hm.keySet()); // [2, 3, 4]

        // Value값 배열로 반환
        System.out.println(hm.values()); // [b, c ,d]

        // 데이터 순회
        Iterator<Integer> it = hm.keySet().iterator();
        while(it.hasNext()) {
            int key = it.next();
            String value = hm.get(key);

            System.out.println(key + " " + value);
        }

        // Map 초기화
        hm.clear();

    }
}
