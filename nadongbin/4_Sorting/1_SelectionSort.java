/*
[문제설명]
Selection Sort(선택정렬)
매번 가장작은 것을 선택해 swap을 통해 정렬하는 알고리즘

[입력값]
7 5 9 0 3 1 6 2 4 8

[출력값]
0 1 2 3 4 5 6 7 8 9

*/

public class Main {
    public static void main(String[] args){

        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for(int i=0; i<arr.length; i++) {
            int minIdx = i;

            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }

                int tmp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = tmp;
            }

            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}