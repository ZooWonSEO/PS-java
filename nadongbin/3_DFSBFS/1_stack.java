/*
[문제설명]
Stack 자료구조를 이용해 다음 명령들을 수행하세요.

1) 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
2) 최상단 원소부터 출력

[출력]
1 3 2 5

*/


import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Stack<Integer> st = new Stack<>();

        st.add(5);
        st.add(2);
        st.add(3);
        st.add(7);
        st.pop();

        st.add(1);
        st.add(4);
        st.pop();

        while(st.isEmpty()==false) {
            System.out.print(st.peek() + " ");
            st.pop();
        }
    }
}
