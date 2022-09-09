import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        // 선언
        Set<Integer> set = new HashSet<>();

// 데이터 삽입
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(2);

// 데이터 삭제
        set.remove(2);

// 데이터 순회
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
