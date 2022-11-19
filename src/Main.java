import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for(int i=0; i<n; i++) {
            arrA[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for(int i=0; i<k; i++) {

            if(arrA[i] < arrB[n-1-i]) {
                int tmp = arrA[i];
                arrA[i] = arrB[n-i-1];
                arrB[i] = tmp;
            }

            else
                break;
        }

        int answer = 0;
        for(int i=0; i<n; i++) {
            answer = answer + arrA[i];
        }

        System.out.print(answer);
    }
}

