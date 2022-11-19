/*
[문제설명]
N명의 학생 정보가 있다. 학생 정보는 학생의 이름과 학생의 성적으로 구분된다.
각 학생의 이름과 성적 정보다 주어졌을 때, 성적이 낮은 순서대로 학생의 이름을 출력하세요.

첫번째 줄에 학생의 수 N이 입력된다. (1 <= N <= 100000)
두번째 줄부터 N+1번째 줄에는 학생의 이름을 나타내는 문자열 A와 
학생의 성적을 나타내는 정수 B가 공백으로 구분되어 입력된다.
문자열 A의 길이와 학생의 성적은 100이하의 자연수이다.

[입력값]
2
홍길동 95
이순신 77

[출력값]
이순신 홍길동

*/

import java.util.*;

class Student {

    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }
};

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] arr = new Student[n];
        sc.nextLine();

        for(int i=0; i<n; i++) {
            String str = sc.nextLine();
            String[] tmp = str.split(" ");
            String name = tmp[0];
            int score = Integer.valueOf(tmp[1]);

            Student s = new Student(name, score);
            arr[i] = s;
        }

        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                if(a.getScore() < b.getScore()) {
                    return -1;
                }
                else if(a.getScore() > b.getScore()) {
                    return 1;
                }
                return 0;
            }
        });

        for(int i=0; i<n; i++) {
            System.out.print(arr[i].getName() + " ");
        }
    }
}

