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
