package DataStructure;
import java.util.*;

/*
- Last In First Out (LIFO) 구조
- push, pop, peek

 */

public class StackTest {
    public static void main(String[] args){

        // Stack 선언
        Stack<Integer> st = new Stack<>();

        // 데이터 삽입
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // 데이터 삭제
        st.pop();

        // 맨 위 데이터 조회
        System.out.println(st.peek()); // 3

        // size()
        System.out.println(st.size()); // 3

        // isEmpty()
        System.out.println(st.isEmpty()); //false

        // 데이터 순회
        for(int i=0; i<st.size(); i++){
            System.out.println(st.get(i));
        }

        // Stack 초기화
        st.clear();

    }
}
