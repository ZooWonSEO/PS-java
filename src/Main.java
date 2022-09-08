import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int card[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i=0; i<10; i++){

            int low = sc.nextInt()-1;
            int high = sc.nextInt()-1;

            for(int j=low; j<=(low+high)/2; j++){
                int tmp = card[low+high-j];
                card[low+high-j] = card[j];
                card[j] = tmp;
            }
        }

        for(int i=0; i<20; i++){
            System.out.print(card[i] + " ");
        }
    }
}
