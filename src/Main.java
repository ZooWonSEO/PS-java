import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int left = 0;
        int right = 0;

        for(int i=0; i<str.length(); i++) {

            if(i < str.length()/2) {
                left = left + (str.charAt(i) - '0');
            }
            else{
                right = right + (str.charAt(i) - '0');
            }
        }

        if(left == right) {
            System.out.println("LUCKY");
        }
        else {
            System.out.println("READY");
        }
    }
}
