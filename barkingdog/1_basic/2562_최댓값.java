import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int mx = 0;
        int mxIdx = 0;

        for(int i=0; i<9; i++){
            list.add(sc.nextInt());
            if(list.get(i) > mx){
                mx = list.get(i);
            }
        }

        mxIdx = list.indexOf(mx)+1;

        System.out.println(mx);
        System.out.println(mxIdx);
    }
}
