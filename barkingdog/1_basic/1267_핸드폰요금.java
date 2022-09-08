import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ys = 0;
        int ms = 0;

        for(int i=0; i<n; i++){
            int sec = sc.nextInt();

            ys = ys + 10 + (sec/30)*10;
            ms = ms + 15 + (sec/60)*15;
        }

        if(ms == ys){
            System.out.print("Y M " + ms);
        }
        else if(ys < ms){
            System.out.print("Y " + ys);
        }
        else if(ys > ms){
            System.out.print("M " + ms);
        }

    }
}
