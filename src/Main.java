import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int row = s.charAt(0) - 'a';
        int col = s.charAt(1) - '1';

        int r[] = {-1, -2, -1, -2, 1, 2, 1, 2};
        int c[] = {-2, -1, 2, 1, -2, -1, 2, 1};

        int answer = 0;

        for(int i=0; i<8; i++) {
            int nr = row + r[i];
            int nc = col + c[i];

            if(nr<0 || nc<0 || nr>7 || nc>7)
                continue;

            answer++;
        }

        System.out.println(answer);
    }
}
