import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list, Collections.reverseOrder());

        int answer = 0;
        int cnt = 0;

        while(cnt < n) {
            cnt = cnt + list.get(cnt);
            answer ++;
        }

        System.out.print(answer);
    }
}
