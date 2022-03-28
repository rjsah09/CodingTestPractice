package Graph;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class NotCompleted_EffectiveHacking {
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    static boolean[] visited;
    static int[] hacked;
    static int nodes, edges;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        init();

        for(int i = 0; i < adj.size(); i++) {
            visited = new boolean[nodes];
            dfs(i);
        }

        for(int i = 0; i < nodes; i++)
            max = Math.max(max, hacked[i]);

        for(int i = 0; i < nodes; i++)
            if(hacked[i] == max) System.out.print((i + 1) + " ");

    }

    static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tok = new StringTokenizer(br.readLine());

        nodes = Integer.parseInt(tok.nextToken());
        edges = Integer.parseInt(tok.nextToken());

        hacked = new int[nodes];

        for(int i = 0; i < nodes; i++)
            adj.add(new ArrayList<Integer>());

        for (int i = 0; i < edges; i++) {
            tok = new StringTokenizer(br.readLine());
            int dest = Integer.parseInt(tok.nextToken()) - 1;
            int start = Integer.parseInt(tok.nextToken()) - 1;
            adj.get(dest).add(start);
        }

        br.close();
    }

    static void dfs(int node) {
        visited[node] = true;

        int lowerNodes = adj.get(node).size();
        for(int i = 0; i < lowerNodes; i++) {
            int target = adj.get(node).get(i);
            if(!visited[target]) {
                hacked[target]++;
                dfs(target);
            }
        }
    }
}
