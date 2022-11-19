/*
[문제설명]
학생 N명의 이름과 국어, 영어, 수학 점수가 주어진다.
이때, 다음과 같은 조건으로 학생의 성적을 정렬한다.

1. 국어 점수가 감소하는 순
2. 국어 점수가 같으면 영어 점수가 증가하는 순
3. 국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순
4. 모든 점수가 같으면 이름이 사전 순으로 증가하는 순
(대문자는 소문자보다 작으므로 사전순으로 앞에온다.)

첫째줄에 도현이네 반의 학생 수 N이 주어진다.
둘째줄부터 각학생의 이름, 국어, 영어, 수학 점수가 공백으로 구분해 주어진다.
이름은 알파벳 대소문자로 이루어져 있고, 길이는 10자리를 넘지 않습니다.

[입력값]
12
Junkyu 50 60 100
Sangkeun 80 60 50
Sunyoung 80 70 100
Soong 50 60 90
Haebin 50 60 100
Kangsoo 60 80 100
Donghyuk 80 60 100
Sei 70 70 70
Wonseob 70 70 90
Sanghyun 70 70 80
nsj 80 80 80
Taewhan 50 60 90

[출력값]
Donghyuk
Sangkeun
Sunyoung
nsj
Wonseob
Sanghyun
Sei
Kangsoo
Haebin
Junkyu
Soong
Taewhan

*/