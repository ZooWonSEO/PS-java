/*
[문제설명]
Insertion Sort(삽입정렬)
특정원소에 대해 적절한 위치에 삽입하는 알고리즘
가정 : 특정 데이터가 적절한 위치에 들어가기 이전에, 그 앞까지의 데이터는 이미 정렬되어 있다.
효율성: 데이터가 거의 정렬되어 있을 때 -> 필요할 때만 연산이 일어남

[입력값]
7 5 9 0 3 1 6 2 4 8

[출력값]
0 1 2 3 4 5 6 7 8 9

*/

public class Main {
    public static void main(String[] args){

        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for(int i=1; i<arr.length; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
                else
                    break;
            }

            for(int j=0; j<arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}