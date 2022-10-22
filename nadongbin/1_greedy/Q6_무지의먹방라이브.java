/*
[문제설명]
회전판에 먹어야할 음식이 N개 있고, 각 음식에는 1부터 N까지 번호가 붙어있습니다.
각 음식을 섭취하는데 일정 시간이 소요되며, 다음과 같은 방법으로 음식을 섭취합니다.

1. 1번 음식부터 먹기 시작하며, 회전판은 번호가 증가하는 순으로 음식을 가져다 놓습니다.
2. 마지막 번호의 음식을 섭취한 후에는 다시 1번 음식이 앞으로 옵니다.
3. 음식 하나를 1초 동안 섭취한 후, 남은 음식은 그대로 두고 다음 음식을 섭취합니다.
4. 다음 음식을 가져오는데 걸리는 시간은 없습니다.

먹방을 한 지 K초 후에 네트워크 장애로 방송이 중단되었습니다.
네트워크 정상화 후, 다시 방송을 이어갈 때 몇 번 음식부터 섭취해야 하는지 알고자합니다.

음식을 모두 먹는데 필요한 시간이 담겨있는 배열 : food_times
네트워크 장애가 발생한 시간 K초가 매개변수로 주어질 때, 몇 번 음식부터 다시 섭취해야하는지 구하세요.

만약, 더 섭취해야 할 음식이 없다면 -1을 반환합니다.

[입력값]
food_times : [3, 1, 2]
k : 5

[출력값]
1

*/
