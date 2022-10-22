import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        int number = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9') {
                number = number + (str.charAt(i) - '0');
            }
            else {
                list.add(str.charAt(i));
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++) {
            sb.append(list.get(i));
        }

        String answer = sb.toString();
        answer = answer + String.valueOf(number);
        System.out.println(answer);
    }
}
