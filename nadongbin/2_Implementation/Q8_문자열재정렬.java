/*
[문제설명]
알파벳 대문자와 숫자 0-9로만 구성된 문자열이 입력으로 주어진다.
이때 모든 알파벳을 오름차순으로 정렬하여 이어서 출력한 뒤,
그 뒤에 모든 숫자를 더한 값을 이어 출력한다.

[입력값1]
K1KA5CB7

[출력값1]
ABCKK13

[입력값2]
AJKDLSI412K4JSJ9D

[출력값2]
ADDIJJJKKLSS20

*/

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
