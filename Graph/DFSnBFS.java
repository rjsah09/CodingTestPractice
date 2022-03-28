package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSnBFS {
    static boolean[][] adjMatrix;
    static boolean[] visitedDfs;
    static boolean[] visitedBfs;
    static int nodes;
    static int edges;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nodes = in.nextInt();
        edges = in.nextInt();
        int startNode = in.nextInt() - 1;
        adjMatrix = new boolean[nodes][nodes];
        visitedDfs = new boolean[nodes];
        visitedBfs = new boolean[nodes];

        for(int i = 0; i < edges; i++) {
            int n1 = in.nextInt() - 1;
            int n2 = in.nextInt() - 1;
            adjMatrix[n1][n2] = true;
            adjMatrix[n2][n1] = true;
        }

        dfs(startNode);
        System.out.println("");
        bfs(startNode);
    }

    static void dfs(int node) {
        visitedDfs[node] = true;
        System.out.print((node + 1));

        for(int i = 0; i < nodes; i++) {
            if(adjMatrix[node][i] && !visitedDfs[i]) {
                System.out.print(" ");
                dfs(i);
            }
        }
    }

    static void bfs(int node) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(node);
        while(!q.isEmpty()) {
            int nowNode = q.poll();
            if(!visitedBfs[nowNode])
                System.out.print(nowNode + 1);
            visitedBfs[nowNode] = true;

            for(int i = 0; i < nodes; i++) {
                if(adjMatrix[nowNode][i] && !visitedBfs[i])
                    q.offer(i);
            }

            System.out.print(" ");
        }
    }
}
