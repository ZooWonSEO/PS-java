/*
[문제설명]
3x3의 인접리스트 그래프를 출력하세요.

[입력]
{0, 7, 5},
{7, 0, INF},
{5, INF, 0}

*/

import java.sql.Array;
import java.util.*;

class node {

    private int index;
    private int distance;

    public node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public void show() {
        System.out.print("(" + this.index + "," + this.distance + ") ");
    }
}

public class Main {

    // 행이 3개인 인접리스트 표현
    public static ArrayList<ArrayList<node>> graph = new ArrayList<ArrayList<node>>();

    public static void main(String args[]) {

        // 그래프초기화
        for(int i=0; i<3; i++) {
            graph.add(new ArrayList<node>());
        }

        // 노드 0에 연결된 노드정보저장 (노드, 거리)
        graph.get(0).add(new node(1, 7));
        graph.get(0).add(new node(2, 5));

        // 노드 1에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(1).add(new node(0, 7));

        // 노드 2에 연결된 노드 정보 저장 (노드, 거리)
        graph.get(2).add(new node(0, 5));

        // 그래프 출력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
    }
}
